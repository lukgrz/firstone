package com.kodilla.good.patterns.challenges.productOrderService;

public class ProductDto {
    public String name;

    public ProductDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
