package com.kodilla.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements Pizza {

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getDescription() {
        return "Your pizza contains dough, tomato sauce, cheese";
    }
}
