package com.kodilla.good.patterns.challenges.productOrderService;

import com.kodilla.good.patterns.challenges.productOrderService.products.Product;

import java.time.LocalDate;
import java.util.Map;

public interface OrderRepository {
    boolean createOrder(User user, Basket basket);
}
