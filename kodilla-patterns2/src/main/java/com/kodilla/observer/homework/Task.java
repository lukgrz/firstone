package com.kodilla.observer.homework;

public class Task {

    private String title;
    private String link;

    public Task(String title, String link) {
        this.title = title;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }
}
