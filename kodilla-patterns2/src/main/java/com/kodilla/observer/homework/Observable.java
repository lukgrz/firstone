package com.kodilla.observer.homework;

public interface Observable {

    void registerObserver(Mentor mentor);
    void notifyObserver();
    void removeObserver();
}
