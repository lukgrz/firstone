package com.kodilla.good.patterns.challenges.productOrderService;

import java.time.LocalDate;

public class Busket {
    private User user;
    private int price;
    private LocalDate dayOfDelivery;

    public Busket(User user, int price, LocalDate dayOfDelivery) {
        this.user = user;
        this.price = price;
        this.dayOfDelivery = dayOfDelivery;
    }

    public User getUser() {
        return user;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getDayOfDelivery() {
        return dayOfDelivery;
    }
}
