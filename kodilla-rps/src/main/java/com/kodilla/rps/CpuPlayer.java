package com.kodilla.rps;

import java.util.Random;

public class CpuPlayer implements Player{
    final String Name = "CPU";
    private int points = 0;
    private int move;

    public CpuPlayer() {
    }

    public void cpuMove() {
        move = 1+(new Random().nextInt(3));
    }

    public void addPoint() {
        points++;
    }

    public int getPoints() {
        return points;
    }

    public String getMove() {
        return Integer.toString(move);
    }

    public String getName() {
        return Name;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
