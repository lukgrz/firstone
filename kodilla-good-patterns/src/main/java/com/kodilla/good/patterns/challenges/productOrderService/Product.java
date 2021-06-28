package com.kodilla.good.patterns.challenges.productOrderService;

public class Product {
    private String name;
    private int value;
    private int weight;
    private String manufactor;

    public Product(String name, int value, int weight, String manufactor) {
        this.name = name;
        this.value = value;
        this.weight = weight;
        this.manufactor = manufactor;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }
}
