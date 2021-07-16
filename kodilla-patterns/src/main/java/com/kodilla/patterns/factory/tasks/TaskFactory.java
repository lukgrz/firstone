package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public final String SHOPPING = "Shopping";
    public final String DRIVING = "Driving";
    public final String PAINTING = "Painting";

    public final Task createTask(final String taskType) {
        switch (taskType) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "Toys", 5.0);
            case DRIVING:
                return new DrivingTask("Driving", "forest", "car");
            case PAINTING:
                return new PaintingTask("Painting", "red", "fridge");
            default:
                return null;
        }
    }
}
