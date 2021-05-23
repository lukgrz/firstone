package com.kodilla.rps;

public class Human implements Player {
    private String name;
    private int points;
    private String move;

    public Human(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public void addPoint() {
        points++;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public String getMove() {
        return move;
    }

}
