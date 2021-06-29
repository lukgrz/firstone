package com.kodilla.good.patterns.challenges.food2door;

public class Main {
    public static void main(String[] args) {
        OrderRetriver orderRetriver = new OrderRetriver();
        OrderRequest orderRequest = orderRetriver.retrieveShops();

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.process(orderRequest);
    }
}
