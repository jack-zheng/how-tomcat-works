package com.jzheng.singleton;

public class Singleton03 {
    private static Singleton03 instance = new Singleton03();
    private Singleton03() {}

    public static Singleton03 getInstance() {
        return instance;
    }
}
