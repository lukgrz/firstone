package com.kodilla.observer.homework;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskList implements Observable {

    private final Student student;
    private Observer observer;
    private final Deque<Task> tasks;

    public TaskList(Student student) {
        tasks = new ArrayDeque<>();
        this.student = student;
    }

    public void addTask(Task task) {
        tasks.offerLast(task);
        notifyObserver();
    }

    public void removeTask(Task task) {
        tasks.peekFirst();
        tasks.pollFirst();
    }

    @Override
    public void registerObserver(Mentor mentor) {
        this.observer = mentor;
    }

    @Override
    public void notifyObserver() {
        observer.update(this);
    }

    @Override
    public void removeObserver() {
        this.observer = null;
    }

    public Student getStudent() {
        return student;
    }

    public Observer getObserver() {
        return observer;
    }

    public Deque<Task> getTasks() {
        return tasks;
    }
}
