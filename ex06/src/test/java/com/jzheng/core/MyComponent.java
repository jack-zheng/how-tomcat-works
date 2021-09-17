package com.jzheng.core;

import java.util.ArrayList;
import java.util.List;

class MyComponent implements Mycycle {
    private List<Mycycle> components = new ArrayList<>();
    private MyListener[] listeners = new MyListener[]{};
    private final String name;

    public MyComponent(String name) {
        this.name = name;
    }

    public void addComponent(Mycycle comp) {
        components.add(comp);
    }

    @Override
    public void start() {
        System.out.println("Component " + name + " start...");
    }

    @Override
    public void stop() {
        System.out.println("Component " + name + " stop...");
    }

    @Override
    public void addListener(MyListener listener) {

    }

    @Override
    public List getListeners() {
        return null;
    }
}