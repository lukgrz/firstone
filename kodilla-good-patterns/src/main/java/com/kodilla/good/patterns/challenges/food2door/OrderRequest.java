package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class OrderRequest {
    private User user;
    private Shop shop;
    private Map<Product, Integer> products;

    public OrderRequest(User user, Shop shop, Map<Product, Integer> products) {
        this.user = user;
        this.shop = shop;
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }
}
