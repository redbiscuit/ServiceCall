package com.bj.basic.body;

import com.bj.basic.HttpHeaders;
import com.bj.basic.json.JsonLookup;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/**
 * @author Liu Dong
 */
class JsonRequestBody<T> extends RequestBody<T> {

    JsonRequestBody(T body) {
        super(body, HttpHeaders.CONTENT_TYPE_JSON, true);
    }

    @Override
    public void writeBody(OutputStream os, Charset charset) throws IOException {
        try (Writer writer = new OutputStreamWriter(os, charset)) {
            JsonLookup.getInstance().lookup().marshal(writer, getBody());
        }
    }
}
