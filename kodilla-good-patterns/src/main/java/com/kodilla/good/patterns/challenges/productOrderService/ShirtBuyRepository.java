package com.kodilla.good.patterns.challenges.productOrderService;

import java.time.LocalDate;

public class ShirtBuyRepository implements BuyRepository{

    public boolean createBusket(User user, int price, LocalDate dayOfDelivery) {
        System.out.println("Order for: "+ user.getName() + "\nPrice: " + price + "PLN" +
                "\nDelivary date: "+dayOfDelivery);
        return true;
    }
}
