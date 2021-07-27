package com.jzheng.pattern.basic;

public class ConcreteHandlerA extends AbstractHandler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("A")) {
            System.out.println("Concrete Handler A processed...");
        } else {
            System.out.println("Concrete Handler A can't process, call other handler...");
            getHandler().handleRequest(condition);
        }
    }
}
