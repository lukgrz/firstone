package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.productOrderService.OrderProcessor;

import java.util.Map;

public interface Shop {
    int process(OrderRequest orderRequest);
    Map<Product,Integer> getAvaliableProducts();
}
