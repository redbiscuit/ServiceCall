package com.bj.basic;

import com.bj.basic.body.RequestBody;
import com.bj.basic.utils.Cookies;
import com.bj.basic.utils.InputOutputs;
import com.bj.basic.exception.RequestsException;
import com.bj.basic.exception.TooManyRedirectsException;

import javax.annotation.Nullable;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.nio.charset.Charset;
import java.util.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/**
 * Execute http request with url connection
 *
 * @author Liu Dong
 */
public class URLConnectionExecutor implements HttpExecutor {

    @Override
    public RawResponse proceed(Request request) {
        RawResponse response = doRequest(request);

        int statusCode = response.getStatusCode();
        if (!request.isFollowRedirect() || !isRedirect(statusCode)) {
            return response;
        }

        // handle redirect
        response.discardBody();
        int redirectTimes = 0;
        int maxRedirectTimes = 5;
        URL redirectUrl = request.getUrl();
        while (redirectTimes++ < maxRedirectTimes) {
            String location = response.getFirstHeader(HttpHeaders.NAME_LOCATION);
            if (location == null) {
                throw new RequestsException("Redirect location not found");
            }
            try {
                redirectUrl = new URL(redirectUrl, location);
            } catch (MalformedURLException e) {
                throw new RequestsException("Resolve redirect url error, location: " + location, e);
            }
            String method = request.getMethod();
            RequestBody<?> body = request.getBody();
            if (statusCode == StatusCodes.MOVED_PERMANENTLY || statusCode == StatusCodes.FOUND || statusCode == StatusCodes.SEE_OTHER) {
                // 301/302 change method to get, due to historical reason.
                method = Methods.GET;
                body = null;
            }

            RequestBuilder builder = Requests.newRequest(method, redirectUrl.toExternalForm())
                    .cookieJar(request.getCookieJar())
                    .socksTimeout(request.getSocksTimeout()).connectTimeout(request.getConnectTimeout())
                    .basicAuth(request.getBasicAuth())
                    .userAgent(request.getUserAgent())
                    .compress(request.isCompress())
                    .verify(request.isVerify())
                    .certs(request.getCerts())
                    .keepAlive(request.isKeepAlive())
                    .followRedirect(false)
                    .proxy(request.getProxy())
                    .body(body);
            response = builder.send();
            if (!isRedirect(response.getStatusCode())) {
                return response;
            }
            response.discardBody();
        }
        throw new TooManyRedirectsException(maxRedirectTimes);
    }

    private static boolean isRedirect(int status) {
        return status == StatusCodes.MULTIPLE_CHOICES || status == StatusCodes.MOVED_PERMANENTLY || status == StatusCodes.FOUND || status == StatusCodes.SEE_OTHER
                || status == StatusCodes.TEMPORARY_REDIRECT || status == StatusCodes.PERMANENT_REDIRECT;
    }


    private RawResponse doRequest(Request request) {
        Charset charset = request.getCharset();
        URL url = request.getUrl();
        @Nullable RequestBody body = request.getBody();
        CookieJar cookieJar = request.getCookieJar();

        HttpURLConnection conn;
        try {
            @Nullable Proxy proxy = request.getProxy();
            if (proxy != null) {
                conn = (HttpURLConnection) url.openConnection(proxy);
            } else {
                conn = (HttpURLConnection) url.openConnection();
            }
        } catch (IOException e) {
            throw new RequestsException(e);
        }

        // disable cache
        conn.setUseCaches(false);

        // deal with https
        if (conn instanceof HttpsURLConnection) {
            SSLSocketFactory ssf = null;
            if (!request.isVerify()) {
                // trust all certificates
                ssf = SSLSocketFactories.getTrustAllSSLSocketFactory();
                // do not verify host of certificate
                ((HttpsURLConnection) conn).setHostnameVerifier(NopHostnameVerifier.getInstance());
            } else if (!request.getCerts().isEmpty()) {
                ssf = SSLSocketFactories.getCustomSSLSocketFactory(request.getCerts());
            }
            if (ssf != null) {
                ((HttpsURLConnection) conn).setSSLSocketFactory(ssf);
            }
        }

        try {
            conn.setRequestMethod(request.getMethod());
        } catch (ProtocolException e) {
            throw new RequestsException(e);
        }
        conn.setReadTimeout(request.getSocksTimeout());
        conn.setConnectTimeout(request.getConnectTimeout());
        // Url connection did not deal with cookie when handle redirect. Disable it and handle it manually
        conn.setInstanceFollowRedirects(false);
        if (body != null) {
            conn.setDoOutput(true);
            String contentType = body.getContentType();
            if (contentType != null) {
                if (body.isIncludeCharset()) {
                    contentType += "; charset=" + request.getCharset().name().toLowerCase();
                }
                conn.setRequestProperty(HttpHeaders.NAME_CONTENT_TYPE, contentType);
            }
        }

        // headers
        if (!request.getUserAgent().isEmpty()) {
            conn.setRequestProperty(HttpHeaders.NAME_USER_AGENT, request.getUserAgent());
        }
        if (request.isCompress()) {
            conn.setRequestProperty(HttpHeaders.NAME_ACCEPT_ENCODING, "gzip, deflate");
        }

        if (request.getBasicAuth() != null) {
            conn.setRequestProperty(HttpHeaders.NAME_AUTHORIZATION, request.getBasicAuth().encode());
        }

        // set cookies
        Collection<Cookie> sessionCookies = cookieJar.getCookies(url);
        if (!request.getCookies().isEmpty() || !sessionCookies.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, ?> entry : request.getCookies()) {
                sb.append(entry.getKey()).append("=").append(String.valueOf(entry.getValue())).append("; ");
            }
            for (Cookie cookie : sessionCookies) {
                sb.append(cookie.getName()).append("=").append(cookie.getValue()).append("; ");
            }
            if (sb.length() > 2) {
                sb.setLength(sb.length() - 2);
                String cookieStr = sb.toString();
                conn.setRequestProperty(HttpHeaders.NAME_COOKIE, cookieStr);
            }
        }

        // set user custom headers
        for (Map.Entry<String, ?> header : request.getHeaders()) {
            conn.setRequestProperty(header.getKey(), String.valueOf(header.getValue()));
        }

        // disable keep alive
        if (!request.isKeepAlive()) {
            conn.setRequestProperty("Connection", "close");
        }

        try {
            conn.connect();
        } catch (IOException e) {
            throw new RequestsException(e);
        }

        try {
            // send body
            if (body != null) {
                sendBody(body, conn, charset);
            }
            return getResponse(url, conn, cookieJar, request.isCompress(), request.getMethod());
        } catch (IOException e) {
            conn.disconnect();
            throw new RequestsException(e);
        } catch (Throwable e) {
            conn.disconnect();
            throw e;
        }
    }

    /**
     * Wrap response, deal with headers and cookies
     */
    private RawResponse getResponse(URL url, HttpURLConnection conn, CookieJar cookieJar, boolean compress,
                                    String method) throws IOException {
        // read result
        int status = conn.getResponseCode();
        String host = url.getHost().toLowerCase();

        String statusLine = null;
        // headers and cookies
        List<Parameter<String>> headerList = new ArrayList<>();
        List<Cookie> cookies = new ArrayList<>();
        int index = 0;
        while (true) {
            String key = conn.getHeaderFieldKey(index);
            String value = conn.getHeaderField(index);
            if (value == null) {
                break;
            }
            index++;
            //status line
            if (key == null) {
                statusLine = value;
                continue;
            }
            headerList.add(Parameter.of(key, value));
            if (key.equalsIgnoreCase(HttpHeaders.NAME_SET_COOKIE)) {
                Cookie c = Cookies.parseCookie(value, host, Cookies.calculatePath(url.getPath()));
                if (c != null) {
                    cookies.add(c);
                }
            }
        }
        Headers headers = new Headers(headerList);

        InputStream input;
        try {
            input = conn.getInputStream();
        } catch (IOException e) {
            input = conn.getErrorStream();
        }
        if (input != null) {
            // deal with [compressed] input, only when use intend to let requests handle compress
            if (compress) {
                input = wrapCompressBody(status, method, headers, input);
            }
        } else {
            input = new ByteArrayInputStream(new byte[0]);
        }

        // update session
        cookieJar.storeCookies(cookies);
        return new RawResponse(status, Objects.requireNonNull(statusLine), headers, cookies, input, conn);
    }

    /**
     * Wrap response input stream if it is compressed, return input its self if not use compress
     */
    private InputStream wrapCompressBody(int status, String method, Headers headers, InputStream input)
            throws IOException {
        // if has no body, some server still set content-encoding header,
        // GZIPInputStream wrap empty input stream will cause exception. we should check this
        if (method.equals(Methods.HEAD)
                || (status >= 100 && status < 200) || status == StatusCodes.NOT_MODIFIED || status == StatusCodes.NO_CONTENT) {
            return input;
        }

        String contentEncoding = headers.getFirstHeader(HttpHeaders.NAME_CONTENT_ENCODING);
        if (contentEncoding == null) {
            return input;
        }

        //we should remove the content-encoding header here?
        switch (contentEncoding) {
            case "gzip":
                try {
                    return new GZIPInputStream(input);
                } catch (IOException e) {
                    InputOutputs.closeQuietly(input);
                    throw e;
                }
            case "deflate":
                // Note: deflate implements may or may not wrap in zlib due to rfc confusing. 
                // here deal with deflate without zlib header
                return new InflaterInputStream(input, new Inflater(true));
            case "identity":
            case "compress": //historic; deprecated in most applications and replaced by gzip or deflate
            default:
                return input;
        }
    }

    private void sendBody(RequestBody body, HttpURLConnection conn, Charset requestCharset) {
        try (OutputStream os = conn.getOutputStream()) {
            body.writeBody(os, requestCharset);
        } catch (IOException e) {
            throw new RequestsException(e);
        }
    }
}
