package com.kodilla.patterns.builder.pizza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTestSuite {

    @Test
    void testPizzaNew() {
        //Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("Onion")
                .souce("Spicy")
                .bottom("Thin")
                .ingredient("Ham")
                .ingredient("Mushroom")
                .build();
        System.out.println(pizza);
        //When
        int howManyIgredients = pizza.getIngredients().size();
        //Then
        assertEquals(3,howManyIgredients);
    }
}
