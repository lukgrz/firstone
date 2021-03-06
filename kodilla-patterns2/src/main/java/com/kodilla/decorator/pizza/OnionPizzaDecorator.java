package com.kodilla.decorator.pizza;

import java.math.BigDecimal;

public class OnionPizzaDecorator extends AbstractPizzaDecorator {

    public OnionPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", onion";
    }
}
