package com.kodilla.decorator.pizza;

import java.math.BigDecimal;

public class GarlicSaucePizzaDecorator extends AbstractPizzaDecorator {

    public GarlicSaucePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + garlic sauce";
    }
}
