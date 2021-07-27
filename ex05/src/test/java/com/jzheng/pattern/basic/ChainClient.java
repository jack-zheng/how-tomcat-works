package com.jzheng.pattern.basic;

public class ChainClient {
    public static void main(String[] args) {
        AbstractHandler handlerA = new ConcreteHandlerA();
        AbstractHandler handlerB = new ConcreteHandlerB();
        AbstractHandler handlerZ = new ConcreteHandlerZ();

        // 设置链顺序
        handlerA.setHandler(handlerB);
        handlerB.setHandler(handlerZ);

        System.out.println("--------------- handle A ---------------");
        handlerA.handleRequest("A");
        System.out.println("--------------- handle B ---------------");
        handlerA.handleRequest("B");
        System.out.println("--------------- handle Z ---------------");
        handlerA.handleRequest("Z");
    }
}
