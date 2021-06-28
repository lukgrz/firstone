package com.kodilla.good.patterns.challenges.productOrderService;

public class Main {

    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        OrderRequest orderRequest = orderRetriever.retrieveOrderRequest();

        OrderProcessor orderProcessor = new OrderProcessor(new MailInformation(), new ProductOrderService(),
                new ProductOrderRepository());
        orderProcessor.process(orderRequest);
        System.out.println(orderProcessor.process(orderRequest));

    }
}
