package com.jzheng.pattern.basic;

public class ConcreteHandlerZ extends AbstractHandler {
    @Override
    public void handleRequest(String condition) {
        // 一般就是最后一个处理器
        System.out.println("Concrete handler z processed...");
    }
}
