package com.kodilla.good.patterns.challenges.productOrderService;

import java.util.Map;

public class ProductOrderService implements OrderService{
    public boolean order (OrderRequestDto orderRequestDto){
        return true;
    }

    @Override
    public int calculateValue(OrderRequestDto orderRequestDto) {
        int result = 0;
        for (Map.Entry<Product, Integer> entry:orderRequestDto.getProducts().entrySet()){
            result += (entry.getKey().getValue()* entry.getValue());
        }
        return result;
    }
}
