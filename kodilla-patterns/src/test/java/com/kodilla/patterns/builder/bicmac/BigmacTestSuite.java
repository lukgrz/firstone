package com.kodilla.patterns.builder.bicmac;

import com.kodilla.patterns.builder.bigmac.Bigmac;
import com.kodilla.patterns.builder.bigmac.Bun;
import com.kodilla.patterns.builder.bigmac.Ingredient;
import com.kodilla.patterns.builder.bigmac.Sauce;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.BUNSTANDARD)
                .sauce(Sauce.THOUSENDISLAND)
                .burgers(5)
                .ingredient(Ingredient.ONION)
                .ingredient(Ingredient.PRAWNS)
                .ingredient(Ingredient.BECON)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(5, bigmac.getBurgers());
        assertEquals(3, howManyIngredients);

    }
}
