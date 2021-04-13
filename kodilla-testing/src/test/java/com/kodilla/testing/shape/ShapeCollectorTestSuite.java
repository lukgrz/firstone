package com.kodilla.testing.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeCollectorTestSuite {
    @Nested
    @DisplayName("Triangle tests")
    class TriangleTest{
        @Test
        void testAddTriangle() {
            //Given
            Shape theTriangle = new Triangle("triangle",10,10);
            ShapeCollector theShapeCollector = new ShapeCollector(theTriangle);
            //When
            theShapeCollector.addFigure(theTriangle);
            //Then
            assertEquals(theTriangle,theShapeCollector.getFigure(0));
        }

        @Test
        void testRemoveTriangle() {
            //Given
            Shape theTriangle = new Triangle("triangle",10,10);
            ShapeCollector theShapeCollector = new ShapeCollector(theTriangle);
            theShapeCollector.addFigure(theTriangle);
            //When
            boolean result = theShapeCollector.removeFigure(theTriangle);
            //Then
            assertTrue(result);
            assertNull(theShapeCollector.getFigure(0));
        }

        @Test
        void testGetFigure() {
            //Given
            Shape theTriangle = new Triangle("triangle",10,10);
            ShapeCollector theShapeCollector = new ShapeCollector(theTriangle);
            theShapeCollector.addFigure(theTriangle);
            //When
            Shape retrieviedShapeCollector;
            retrieviedShapeCollector = theShapeCollector.getFigure(0);
            //Then
            assertEquals(theTriangle,retrieviedShapeCollector);
        }

        @Test
        void testShowFigures() {
            //Given
            Shape theTriangle = new Triangle("triangle",10,10);
            ShapeCollector theShapeCollector = new ShapeCollector(theTriangle);
            theShapeCollector.addFigure(theTriangle);
            //When
            String theName = theTriangle.getShapeName();
            //Then
            assertEquals(theName,theShapeCollector.getFigure(0).getShapeName());
        }
    }


    @Nested
    @DisplayName("Square tests")
    class SquareleTest{
        @Test
        void testAddSquare() {
            //Given
            Shape theSquare = new Square("square",10);
            ShapeCollector theShapeCollector = new ShapeCollector(theSquare);
            //When
            theShapeCollector.addFigure(theSquare);
            //Then
            assertEquals(theSquare,theShapeCollector.getFigure(0));
        }

        @Test
        void testRemoveSquare() {
            //Given
            Shape theSquare = new Square("square",10);
            ShapeCollector theShapeCollector = new ShapeCollector(theSquare);
            theShapeCollector.addFigure(theSquare);
            //When
            boolean result = theShapeCollector.removeFigure(theSquare);
            //Then
            assertTrue(result);
            assertNull(theShapeCollector.getFigure(0));
        }

        @Test
        void testGetFigure() {
            //Given
            Shape theSquare = new Square("square",10);
            ShapeCollector theShapeCollector = new ShapeCollector(theSquare);
            theShapeCollector.addFigure(theSquare);
            //When
            Shape retrieviedShapeCollector;
            retrieviedShapeCollector = theShapeCollector.getFigure(0);
            //Then
            assertEquals(theSquare,retrieviedShapeCollector);
        }

        @Test
        void testShowFigures() {
            //Given
            Shape theSquare = new Square("square",10);
            ShapeCollector theShapeCollector = new ShapeCollector(theSquare);
            theShapeCollector.addFigure(theSquare);
            //When
            String theName = theSquare.getShapeName();
            //Then
            assertEquals(theName,theShapeCollector.getFigure(0).getShapeName());
        }
    }

    @Nested
    @DisplayName("Circle tests")
    class CircleTest{
        @Test
        void testAddCircle() {
            //Given
            Shape theCircle = new Circle("circle",10);
            ShapeCollector theShapeCollector = new ShapeCollector(theCircle);
            //When
            theShapeCollector.addFigure(theCircle);
            //Then
            assertEquals(theCircle,theShapeCollector.getFigure(0));
        }

        @Test
        void testRemoveCircle() {
            //Given
            Shape theCircle = new Circle("circle",10);
            ShapeCollector theShapeCollector = new ShapeCollector(theCircle);
            theShapeCollector.addFigure(theCircle);
            //When
            boolean result = theShapeCollector.removeFigure(theCircle);
            //Then
            assertTrue(result);
            assertNull(theShapeCollector.getFigure(0));
        }

        @Test
        void testGetFigure() {
            //Given
            Shape theCircle = new Circle("circle",10);
            ShapeCollector theShapeCollector = new ShapeCollector(theCircle);
            theShapeCollector.addFigure(theCircle);
            //When
            Shape retrieviedShapeCollector;
            retrieviedShapeCollector = theShapeCollector.getFigure(0);
            //Then
            assertEquals(theCircle,retrieviedShapeCollector);
        }

        @Test
        void testShowFigures() {
            //Given
            Shape theCircle = new Circle("circle",10);
            ShapeCollector theShapeCollector = new ShapeCollector(theCircle);
            theShapeCollector.addFigure(theCircle);
            //When
            String theName = theCircle.getShapeName();
            //Then
            assertEquals(theName,theShapeCollector.getFigure(0).getShapeName());
        }
    }
}
