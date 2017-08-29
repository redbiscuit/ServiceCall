package com.bj.basic.body;

import com.bj.basic.HttpHeaders;
import com.bj.basic.utils.InputOutputs;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/**
 * @author Liu Dong
 */
class InputStreamRequestBody extends RequestBody<InputStream> {
    InputStreamRequestBody(InputStream body) {
        super(body, HttpHeaders.CONTENT_TYPE_BINARY, false);
    }

    @Override
    public void writeBody(OutputStream os, Charset charset) throws IOException {
        InputOutputs.copy(getBody(), os);
    }
}
