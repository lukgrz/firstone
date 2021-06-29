package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class HeathyShop implements Shop{final String name = "HealthyShop";
    private Map<Product, Integer> avaliableProducts;

    public int process(OrderRequest orderRequest){
        int orderValue = 0;
        for (Map.Entry<Product, Integer> entry:orderRequest.getProducts().entrySet()){
            orderValue += entry.getKey().getPrice()* entry.getValue();
            }
        if (orderRequest.getProducts().size()<2){
            orderValue += 10;
        }
        return orderValue;
    }

    public HeathyShop(Map<Product, Integer> avaliableProducts) {
        this.avaliableProducts = avaliableProducts;
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
