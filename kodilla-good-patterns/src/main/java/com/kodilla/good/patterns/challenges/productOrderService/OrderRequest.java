package com.kodilla.good.patterns.challenges.productOrderService;

import java.util.Map;

public class OrderRequest {
    private UserDto userDto;
    private Map<Product, Integer> products;

    public OrderRequest(UserDto userDto, Map<Product, Integer> products) {
        this.userDto = userDto;
        this.products = products;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "userDto=" + userDto +
                ", products=" + products +
                '}';
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }
}
