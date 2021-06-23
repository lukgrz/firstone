package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.productOrderService.*;
import com.kodilla.good.patterns.challenges.productOrderService.information.MailService;

public class Main {
    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order= orderRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new UserOrderService(),
                new UserOrderRepository());
        productOrderService.process(order);

    }
}
