package com.jzheng.core;

public class Client {
    public static void main(String[] args) {
        Component01 cp1 = new Component01();
        Component02 cp2 = new Component02();

        cp1.start();
        cp2.start();

        System.out.println("\nFinish server start...");
        // do service...
        System.out.println("Mock web service...");
        System.out.println("Start server stop...\n");

        cp2.start();
        cp1.start();
    }
}
