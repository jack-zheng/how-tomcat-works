package com.jzheng.logger;

import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

public class TestFileLogger {
    @Test
    public void test() {
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        System.out.println(ts);

        String tsString = ts.toString().substring(0, 19);
        System.out.println(tsString);

        String tsDate = tsString.substring(0, 10);
        System.out.println(tsDate);
    }
}
