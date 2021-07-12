package com.jzheng.common;

import com.jzheng.common.Request;
import com.jzheng.common.Response;

import java.io.IOException;

public class StaticResourceProcessor {

    public void process(Request request, Response response) {
        try {
            response.sendStaticResource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
