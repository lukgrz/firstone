package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    public void addTest () {
        //Given
        double result;
        //When
        result = calculator.add(2,2);
        //Then
        assertEquals(4,result);
    }

    @Test
    public void substractTest () {
        //Given
        double result;
        //When
        result = calculator.sub(5,2);
        //Then
        assertEquals(3,result);
    }

    @Test
    public void multiplyTest () {
        //Given
        double result;
        //When
        result = calculator.mul(5, 2);
        //Then
        assertEquals(10, result);
    }

    @Test
    public void divideTest () {
        //Given
        double result;
        //When
        result = calculator.div(6, 2);
        //Then
        assertEquals(3, result);
    }
}
