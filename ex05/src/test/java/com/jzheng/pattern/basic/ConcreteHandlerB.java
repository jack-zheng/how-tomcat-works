package com.jzheng.pattern.basic;

public class ConcreteHandlerB extends AbstractHandler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("B")) {
            System.out.println("Concrete Handler B processed...");
        } else {
            System.out.println("Concrete Handler B can't process, call other handler...");
            getHandler().handleRequest(condition);
        }
    }
}
