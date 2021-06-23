package com.kodilla.good.patterns.challenges.productOrderService;

public class Order {
    private User user;
    private Basket basket;

    public Order(User user, Basket basket) {
        this.user = user;
        this.basket = basket;
    }

    public User getUser() {
        return user;
    }

    public Basket getBasket() {
        return basket;
    }
}
