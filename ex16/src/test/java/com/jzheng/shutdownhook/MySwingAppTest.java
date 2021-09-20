package com.jzheng.shutdownhook;

import org.junit.jupiter.api.Test;

class MySwingAppTest {
    @Test
    public void test() {
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("catalina.home"));
    }
}