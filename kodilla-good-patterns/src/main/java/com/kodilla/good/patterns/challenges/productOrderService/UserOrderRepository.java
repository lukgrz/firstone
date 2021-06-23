package com.kodilla.good.patterns.challenges.productOrderService;

import com.kodilla.good.patterns.challenges.productOrderService.products.Product;

import java.time.LocalDate;
import java.util.Map;

public class UserOrderRepository implements OrderRepository {

    public boolean createOrder(User user, Basket basket) {
        System.out.println("Order for: " + user.getName() + "\nTotal price to pay: " + basket.calculateBasketValue(basket.getOrderedProducts()) +
                "PLN" + "\nDelivary date: "+basket.getDayOfDelivery()+"\nList of ordered products: ");
        for (Map.Entry<Product, Integer> entry:basket.getOrderedProducts().entrySet()){
            System.out.println(entry.getKey() + " x " + entry.getValue() + " PCS");
        }

        return true;
    }
}
