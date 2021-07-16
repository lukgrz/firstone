package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {

    private final String taskName;
    private final String color;
    private final String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Painting: " + color + whatToPaint);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (color.equals("red")) {
            return true;
        } else {
            System.out.println("You have to buy more paint");
            return false;
        }
    }
}
