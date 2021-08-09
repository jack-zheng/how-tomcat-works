package com.jzheng.ex01;

import java.io.IOException;
import java.io.InputStream;

public class Request {
    private InputStream input;
    private String uri;

    public Request(InputStream input) {
        this.input = input;
    }

    public void parse() {
        // Read a set of characters from the socket
        StringBuilder request = new StringBuilder();
        int i;
        byte[] buffer = new byte[2048];
        try {
            // i = socket 中 request 的长度，一个字母占 1 位，所以这里默认最长就 2048 的字母，不是很严谨，但是这里够用
            i = input.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
            i = -1;
        }

        // 将字母拼接起来
        for (int j = 0; j < i; j++) {
            request.append((char) buffer[j]);
        }
        System.out.print(request);
        uri = parseUri(request.toString());
    }

    private String parseUri(String requestString) {
        int index1, index2;
        index1 = requestString.indexOf(' ');
        if (index1 != -1) {
            index2 = requestString.indexOf(' ', index1 + 1);
            if (index2 > index1)
                return requestString.substring(index1 + 1, index2);
        }
        return null;
    }

    public String getUri() {
        return uri;
    }
}