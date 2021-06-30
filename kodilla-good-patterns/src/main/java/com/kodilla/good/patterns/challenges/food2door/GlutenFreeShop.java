package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class GlutenFreeShop implements Shop{
    private final String name = "GlutenFreeShop";
    private Map<Product, Integer> avaliableProducts;
    private final int deliveryCost = 20;

    public GlutenFreeShop(Map<Product, Integer> avaliableProducts) {
        this.avaliableProducts = avaliableProducts;
    }

    public int process(OrderRequest orderRequest) {
        int orderValue = 0;
        for (Map.Entry<Product, Integer> entry:orderRequest.getProducts().entrySet()){
            orderValue += entry.getKey().getPrice()* entry.getValue();
            }
        return orderValue+deliveryCost;
    }

    public String getName() {
        return name;
    }

    public Map<Product, Integer> getAvaliableProducts() {
        return avaliableProducts;
    }

    public void setAvaliableProducts(Map<Product, Integer> avaliableProducts) {
        this.avaliableProducts = avaliableProducts;
    }
}
