package com.jzheng.core;

import java.util.List;

class Component02 implements Mycycle{

    @Override
    public void start() {
        System.out.println("Component02 start...");
    }

    @Override
    public void stop() {
        System.out.println("Component02 stop...");
    }

    @Override
    public void addListener(MyListener listener) {

    }

    @Override
    public List getListeners() {
        return null;
    }
}