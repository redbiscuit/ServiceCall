package com.bj.basic;

import com.bj.basic.body.Part;
import org.junit.Test;

import java.io.File;

public class MultiPartTest {

    @Test
    public void testOf() throws Exception {
        Part multiPart = Part.file("writeTo", new File("MultiPartTest.java"));
    }
}