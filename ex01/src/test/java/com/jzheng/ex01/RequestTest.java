package com.jzheng.ex01;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

class RequestTest {

    @Test
    public void test_ByteArrayInputStream() throws IOException {
        String content = "hello world";
        InputStream in = new ByteArrayInputStream(content.getBytes());
        byte[] buffer = new byte[1024];
        int n = in.read(buffer);
        // n = 11, 和 content 的长度一样
        System.out.println("n = " + n);
        in.close();
    }
}