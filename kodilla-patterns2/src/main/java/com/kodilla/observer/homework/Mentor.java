package com.kodilla.observer.homework;

public class Mentor implements Observer{

    private String name;
    private int count;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TaskList taskList) {
        System.out.println("Student: " + taskList.getStudent() +
                " finish task new task " + taskList.getTasks().peekLast().getTitle() +
                " link: " + taskList.getTasks().peekLast().getLink());
        count++;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}
