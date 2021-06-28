package com.kodilla.good.patterns.challenges.productOrderService;

import java.util.Map;

public class OrderResponse {
    private OrderRequest orderRequest;
    private boolean isAvaliable;
    private int value;

    public OrderResponse(OrderRequest orderRequest, boolean isAvaliable, int value) {
        this.orderRequest = orderRequest;
        this.isAvaliable = isAvaliable;
        this.value = value;
    }

    @Override
    public String toString() {
        return "User: " + orderRequest.getUserDto() +
                "\nOrder products: " + orderRequest.getProducts() +
                "\nOrder is made: " + isAvaliable +
                "\nOrder value: " + value;
    }

    public OrderRequest getOrderRequest() {
        return orderRequest;
    }

    public void setOrderRequest(OrderRequest orderRequest) {
        this.orderRequest = orderRequest;
    }

    public boolean isAvaliable() {
        return isAvaliable;
    }

    public void setAvaliable(boolean avaliable) {
        isAvaliable = avaliable;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
