package com.kodilla.good.patterns.challenges.productOrderService;

public class OrderDto {
    public User user;
    public Basket basket;
    public boolean isOrdered;

    public OrderDto(User user, Basket basket, boolean isOrdered) {
        this.user = user;
        this.basket = basket;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public Basket getBasket() {
        return basket;
    }
}
