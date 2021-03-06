package com.jzheng.connector.http;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

class SocketInputStreamTest {

    private String sample = "GET /servlet/ModernServlet?userName=tarzan&password=pwd HTTP/1.1\n" +
            "User-Agent: Mozilla/4.0 (compatible; MSIE5.01; Windows NT)\n" +
            "Host: www.tutorialspoint.com\n" +
            "Accept-Language: en-us\n" +
            "Accept-Encoding: gzip, deflate\n" +
            "Connection: Keep-Alive";

    @Test
    public void test_read_request_line() throws IOException {
        SocketInputStream in = new SocketInputStream(new ByteArrayInputStream(sample.getBytes()), 2048);
        HttpRequestLine line = new HttpRequestLine();
        in.readRequestLine(line);
        // /servlet/ModernServlet?userName=tarzan&password=pwd             
        // GET     
        System.out.println(new String(line.uri));
        System.out.println(new String(line.method));
    }

    @Test
    public void test_read_request_header() throws IOException {
        SocketInputStream in = new SocketInputStream(new ByteArrayInputStream(sample.getBytes()), 2048);
        HttpRequestLine line = new HttpRequestLine();
        in.readRequestLine(line);
        // /servlet/ModernServlet?userName=tarzan&password=pwd             
        // GET     
        System.out.println(new String(line.uri));
        System.out.println(new String(line.method));
    }
}