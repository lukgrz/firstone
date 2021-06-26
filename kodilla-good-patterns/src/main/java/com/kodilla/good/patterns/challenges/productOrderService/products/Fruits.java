package com.kodilla.good.patterns.challenges.productOrderService.products;

public class Fruits implements Product{
    private String name;
    private int price;

    public Fruits(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }
}