package com.jzheng.core;

public class Client2 {
    public static void main(String[] args) {
        MyComponent m1 = new MyComponent("m1");
        MyComponent m2 = new MyComponent("m2");

        MyComponent m1_1 = new MyComponent("m1_1");
        MyComponent m1_2 = new MyComponent("m1_2");
        MyComponent m2_1 = new MyComponent("m2_1");

        m1.addComponent(m1_1);
        m1.addComponent(m1_2);
        m2.addComponent(m2_1);

        m1.start();
        m2.start();

        System.out.println("\nFinish server start...");
        // do service...
        System.out.println("Mock web service...");
        System.out.println("Start server stop...\n");

        m2.stop();
        m1.stop();
    }
}
