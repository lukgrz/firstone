package com.kodilla.good.patterns.challenges.productOrderService;

import com.kodilla.good.patterns.challenges.productOrderService.products.Product;

import java.time.LocalDate;
import java.util.Map;

public class Basket {
    private LocalDate dayOfDelivery;
    private Map<Product, Integer> orderedProducts;

    public Basket(LocalDate dayOfDelivery, Map<Product, Integer> orderedProducts) {
        this.dayOfDelivery = dayOfDelivery;
        this.orderedProducts = orderedProducts;
    }

    public int calculateBasketValue(Map<Product,Integer> products){
        int basketValue = 0;
        for (Map.Entry<Product, Integer> entry:products.entrySet()) {
            basketValue += entry.getValue()*entry.getKey().getPrice();
        }
        return basketValue;
    }

    public void addToBusket(Product product, int quantity) {
        orderedProducts.put(product, quantity);
    }

    public Map<Product, Integer> getOrderedProducts() {
        return orderedProducts;
    }

    public LocalDate getDayOfDelivery() {
        return dayOfDelivery;
    }
}
