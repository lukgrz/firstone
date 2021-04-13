package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private Shape shape;
    List<Shape> shapeCollectorList = new ArrayList<>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape) {
        shapeCollectorList.add(this.shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapeCollectorList.contains(this.shape)) {
            shapeCollectorList.remove(this.shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        if(shapeCollectorList.isEmpty()){
            return null;
        }
        return shapeCollectorList.get(n);
    }

    public String showFigures() {
        return "tring";
    }
}
