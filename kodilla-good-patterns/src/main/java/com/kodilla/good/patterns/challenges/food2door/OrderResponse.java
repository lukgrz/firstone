package com.kodilla.good.patterns.challenges.food2door;

public class OrderResponse {
    private User user;
    private boolean isrealized;
    private int Value;

    public OrderResponse(User user, boolean isrealized, int value) {
        this.user = user;
        this.isrealized = isrealized;
        Value = value;
    }
}
