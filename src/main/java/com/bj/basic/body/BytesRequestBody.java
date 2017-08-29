package com.bj.basic.body;

import com.bj.basic.HttpHeaders;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

class BytesRequestBody extends RequestBody<byte[]> {
    BytesRequestBody(byte[] body) {
        super(body, HttpHeaders.CONTENT_TYPE_BINARY, false);
    }

    @Override public void writeBody(OutputStream os, Charset charset) throws IOException {
        os.write(getBody());
    }
}
