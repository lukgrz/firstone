package com.kodilla.good.patterns.challenges.productOrderService;

import com.kodilla.good.patterns.challenges.productOrderService.products.Product;

import java.time.LocalDate;
import java.util.Map;

public interface OrderService {
    boolean order(User user, Basket basket);
}
