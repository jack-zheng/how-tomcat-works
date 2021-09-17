package com.jzheng.connector.http;

import org.apache.catalina.util.StringManager;
import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

class HttpProcessorTest {

    @Test
    public void test_StringManager() {
        StringManager sm = StringManager.getManager("com.jzheng.connector.http");
        System.out.println(sm.getString("httpConnector.alreadyInitialized"));

        System.out.println(sm.getString("httpConnector.anAddress",  "192.165.23.26",12));
    }

    @Test
    public void test_ResourceBundle() {
        ResourceBundle rb = ResourceBundle.getBundle("com.jzheng.connector.http.LocalStrings");
        System.out.println(rb.getBaseBundleName());
        System.out.println(rb.getObject("httpConnector.anAddress"));
    }

}