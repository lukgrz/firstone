package com.kodilla.decorator.pizza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTestSuite {

    @Test
    public void testPizzaWithSalamiOnionGarlicSauceGetCost() {
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new SalamiPizzaDecorator(thePizza);
        thePizza = new OnionPizzaDecorator(thePizza);
        thePizza = new GarlicSaucePizzaDecorator(thePizza);
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(30), theCost);
    }

    @Test
    public void testPizzaWithSalamiOnionGarlicSauceGetDescription() {
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new SalamiPizzaDecorator(thePizza);
        thePizza = new OnionPizzaDecorator(thePizza);
        thePizza = new GarlicSaucePizzaDecorator(thePizza);
        //When
        String descrition = thePizza.getDescription();
        //Then
        assertEquals("Your pizza contains dough, tomato sauce," +
                " cheese, salami, onion + garlic sauce", descrition);
    }
}
