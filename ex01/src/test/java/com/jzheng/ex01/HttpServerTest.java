package com.jzheng.ex01;

import org.junit.jupiter.api.Test;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

import static org.junit.jupiter.api.Assertions.*;

class HttpServerTest {

    @Test
    public void test_webroot_value() {
        // default output: /Users/i306454/IdeaProjects/how-tomcat-works/ex01/webroot
//        System.out.println(HttpServer.WEB_ROOT);
    }

    @Test
    public void test_get_resources_folder_path() {
        // output: /Users/i306454/IdeaProjects/how-tomcat-works/ex01/target/test-classes/
        URL url = this.getClass().getClassLoader().getResource(".");
        System.out.println(url.getPath());
    }

    @Test
    public void test_InetAddress() throws UnknownHostException {
        System.out.println(InetAddress.getByName("127.0.0.1").getHostName());
    }
}