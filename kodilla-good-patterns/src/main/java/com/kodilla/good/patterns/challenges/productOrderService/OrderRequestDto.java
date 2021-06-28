package com.kodilla.good.patterns.challenges.productOrderService;

import java.util.HashMap;
import java.util.Map;

public class OrderRequestDto {
    private Map<Product,Integer> products;

    public OrderRequestDto(Map<Product, Integer> products) {
        this.products = products;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }
}
