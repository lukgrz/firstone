package com.kodilla.good.patterns.challenges.productOrderService;

public class BuyDto {
    public User user;
    public boolean isBougth;

    public BuyDto(final User user, final boolean isBougth) {
        this.user = user;
        this.isBougth = isBougth;
    }

    public User getUser() {
        return user;
    }

    public boolean isBougth() {
        return isBougth;
    }
}
