package com.kodilla.good.patterns.challenges.productOrderService;

public class ProductOrderRepository implements OrderRepository {
    @Override
    public boolean withdraw(OrderRequestDto orderRequestDto) {
        return true;
    }
}
