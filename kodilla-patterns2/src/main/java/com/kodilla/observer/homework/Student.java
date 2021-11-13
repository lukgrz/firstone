package com.kodilla.observer.homework;

public class Student {

    private String username;

    public Student(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return username;
    }
}
