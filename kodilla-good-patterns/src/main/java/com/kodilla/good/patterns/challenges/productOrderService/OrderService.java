package com.kodilla.good.patterns.challenges.productOrderService;

public interface OrderService {
    boolean order (OrderRequestDto orderRequestDto);

    int calculateValue (OrderRequestDto orderRequestDto);
}
