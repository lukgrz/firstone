package com.kodilla.patterns.factory;

import java.security.PublicKey;

public class ShapeFactory {

    public final String CIRCLE = "CIRCLE";
    public final String SQUARE = "SQUARE";
    public final String RECTANGLE = "RECTANGLE";

    public final Shape makeShape(final String ShapeClass){
        switch (ShapeClass) {
            case CIRCLE:
                return new Circle("The rounded circle", 4.5);
            case SQUARE:
                return new Square("The angular square", 7.0);
            case RECTANGLE:
                return new Rectanlge("The long rectangle",15.0,2.5);
            default:
                return null;
        }
    }
}
