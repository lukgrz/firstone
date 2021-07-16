package com.kodilla.patterns.factory.tasks;

import java.sql.SQLOutput;

public final class ShoppingTask implements Task {

    private final String taskName;
    private final String whattoBuy;
    private final double quantity;

    public ShoppingTask(String taskName, String whattoBuy, double quantity) {
        this.taskName = taskName;
        this.whattoBuy = whattoBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Buying: " + whattoBuy);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (quantity < 10) {
            return true;
        } else {
            return false;
        }
    }
}
