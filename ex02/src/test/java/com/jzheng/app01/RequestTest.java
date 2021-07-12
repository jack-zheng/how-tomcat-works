package com.jzheng.app01;

import com.jzheng.common.Constants;
import com.jzheng.common.Request;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

class RequestTest {

    @Test
    public void test_getUri() {
        String sample = "GET /servlet/PrimitiveServlet HTTP/1.1\n" +
                "Host: localhost:8080\n" +
                "User-Agent: curl/7.64.1\n" +
                "Accept: */*";

        Request request = new Request(new ByteArrayInputStream(sample.getBytes()));
        request.parse();
        System.out.println("\n---- break line ----");
        System.out.println(request.getUri());


    }

    @Test
    public void test_find_servlet() {
        System.out.println(Constants.WEB_ROOT);
    }
}