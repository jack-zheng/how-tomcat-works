package com.jzheng.core;

import java.util.ArrayList;
import java.util.List;

class Component01 implements Mycycle {
    private List<Mycycle> components = new ArrayList<>();

    public void addComponent(Mycycle comp) {
        components.add(comp);
    }

    @Override
    public void start() {
        System.out.println("Component01 start...");
    }

    @Override
    public void stop() {
        System.out.println("Component01 stop...");
    }

    @Override
    public void addListener(MyListener listener) {

    }

    @Override
    public List getListeners() {
        return null;
    }
}