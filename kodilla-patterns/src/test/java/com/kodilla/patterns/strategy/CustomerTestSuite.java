package com.kodilla.patterns.strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTestSuite {

    @Test
            public void testDefaultInvestingStrategy() {
        //Given
        Customer steven = new IndividualCustomer("Steven Links" );
        Customer john = new IndividualYoungCustomer("John Hemerald" );
        Customer kodilla = new CorporateCustomer("Kodilla" );

        //When
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should: " + stevenShouldBuy);
        String johnShouldBuy = john.predict();
        System.out.println("John should: " + johnShouldBuy);
        String kodillaShouldBuy = kodilla.predict();
        System.out.println("Kodilla should: " + kodillaShouldBuy);

        //Then
        assertEquals("[Aggressive predictor] Buy stock XYZ", johnShouldBuy);
        assertEquals("[Balanced predictor] Buy shared units of Fund XYZ", kodillaShouldBuy);
        assertEquals("[Conservative predictor] Buy debentures XYZ", stevenShouldBuy);
    }

    @Test
    public void testIndividualInvestingStrategy() {
        //Given
        Customer steven = new IndividualCustomer("Steven Links");

        //When
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should: " + stevenShouldBuy);
        steven.setBuyPredictor(new AggressivePredictor());
        stevenShouldBuy = steven.predict();
        System.out.println("Steven should: " + stevenShouldBuy);

        //Then
        assertEquals("[Aggressive predictor] Buy stock XYZ", stevenShouldBuy);
    }
}
