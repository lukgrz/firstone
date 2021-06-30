package com.kodilla.good.patterns.challenges.productOrderService;

import java.util.ArrayList;
import java.util.List;

public class ProductOrderRepository implements OrderRepository {
    private List<OrderRequestDto> orderHistory = new ArrayList<>();

    @Override
    public boolean withdraw(OrderRequestDto orderRequestDto) {
        orderHistory.add(orderRequestDto);
        return true;
    }

    public List<OrderRequestDto> getOrderHistory() {
        return orderHistory;
    }
}
