package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void TestPeopleQuantity(){

        //Given
        World world = new World();
        Continent asia = new Continent("Asia");
        Continent europe = new Continent("Europe");
        Country poland = new Country("Poland",new BigDecimal("38000000"));
        Country germany = new Country ("Germany",new BigDecimal("70000000"));
        Country china = new Country ("China", new BigDecimal("1300000000"));

        europe.addCountry(poland);
        europe.addCountry(germany);
        asia.addCountry(china);
        world.addContinent(asia);
        world.addContinent(europe);

        //When
        BigDecimal peopleOnTheWorld = world.getPeopleQunatity();
        BigDecimal expectedPeopleOnTheWorld = new BigDecimal("1408000000");

        //Then
        Assertions.assertEquals(expectedPeopleOnTheWorld,peopleOnTheWorld);


    }
}
