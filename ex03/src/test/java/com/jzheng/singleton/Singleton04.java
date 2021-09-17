package com.jzheng.singleton;

public class Singleton04 {
    private volatile static Singleton04 instance;
    private Singleton04() {}

    public static Singleton04 getInstance() {
        if (instance == null) {
            synchronized (Singleton04.class) {
                if (instance == null) {
                    instance = new Singleton04();
                }
            }
        }
        return instance;
    }
}
