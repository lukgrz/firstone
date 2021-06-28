package com.kodilla.good.patterns.challenges.productOrderService;

import java.util.HashMap;
import java.util.Map;

public class OrderRetriever {
    public OrderRequest retrieveOrderRequest() {
        User user = new User("Mr. Stevens", "Darth", "Vader", "DeathStar, room 40002");
        Map<Product, Integer> products = new HashMap<>();
        Product lightSaber = new Product("Lightsaber", 300, 10, "Wookie and son");
        Product blaster = new Product("Blaster",60,15,"Corellian national factory");

        products.put(lightSaber, 5);
        products.put(blaster, 200);
        return new OrderRequest(new UserDto(user.getNickName()),products);
    }
}
