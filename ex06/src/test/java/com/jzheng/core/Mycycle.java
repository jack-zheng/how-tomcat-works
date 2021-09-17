package com.jzheng.core;

import java.util.List;

public interface Mycycle {
    void start();

    void stop();

    void addListener(MyListener listener);

    List getListeners();
}
