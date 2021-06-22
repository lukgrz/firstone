package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.productOrderService.*;

public class Main {
    public static void main(String[] args) {
        BusketRetriever busketRetriever = new BusketRetriever();
        Busket busket = busketRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new ShirtBuyService(),
                new ShirtBuyRepository());
        productOrderService.process(busket);

    }
}
