package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {
    OrderService orderService = new OrderService();

    public OrderResponse process (OrderRequest orderRequest) {
        int orderValue = orderRequest.getShop().process(orderRequest);

        if (orderService.orderIsAvaliable(orderRequest)) {
            return new OrderResponse(orderRequest.getUser(), true, orderValue);
        } else {
            return new OrderResponse(orderRequest.getUser(), false, orderValue);
        }
    }
}
