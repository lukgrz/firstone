package com.kodilla.patterns.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeFactoryTestSuite {

    @Test
    void testFactoryCircle() {
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape circle = factory.makeShape(factory.CIRCLE);
        //Then
        assertEquals(Math.PI * Math.pow(4.5, 2.0), circle.getArea());
        assertEquals("The rounded circle", circle.getName());
    }

    @Test
    void testFactorySquare() {
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape square = factory.makeShape(factory.SQUARE);
        //Then
        assertEquals(28.0, square.getCircumference());
        assertEquals("The angular square", square.getName());
    }

    @Test
    void testFactoryRectangle() {
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape rectangle = factory.makeShape(factory.RECTANGLE);
        //Then
        assertEquals(37.5, rectangle.getArea());
        assertEquals("The long rectangle", rectangle.getName());
    }
}
