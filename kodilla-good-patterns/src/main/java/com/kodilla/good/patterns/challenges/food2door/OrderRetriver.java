package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRetriver {


    public OrderRequest retrieveShops() {

        Map<Product, Integer> extraFoodShopProducts = new HashMap<>();
        Product product1 = new Product("Cucumber",4);
        Product product2 = new Product("Tomato",3);
        Product product3 = new Product("Bread", 15);

        extraFoodShopProducts.put(product1,100);
        extraFoodShopProducts.put(product2, 200);
        extraFoodShopProducts.put(product3, 100);

        ExtraFoodShop extraFoodShop = new ExtraFoodShop(extraFoodShopProducts);

        User user = new User("Jack","Lonely Island");
        Map<Product, Integer> order = new HashMap<>();

        Product orderedProduct = new Product("Tomato");
        Product orderedProduct1 = new Product("Bread");

        order.put(orderedProduct, 10000000);
        order.put(orderedProduct1, 10);

        return new OrderRequest(user,extraFoodShop,order);
    }
}
