package com.kodilla.rps;

import java.util.Scanner;

public class Game {
    private int pointsToWin;

    public void begining(Human human, Information information, InputData inputData) {
        information.welcomeInformation();
        inputData.enterName(human);
        information.pointsToWinInformation(human);
        pointsToWin = inputData.enterPointsToWin();
    }

    public void makeMove(Human human, CpuPlayer cpu, Information information, InputData inputData) {
        information.scoreInformation(human, cpu);
        information.instructionInformation(pointsToWin);
        inputData.enterHumanMove(human);

    }

    public void round (Human human, CpuPlayer cpu, Information information, Game game){
        game.rpsRecognizer(human,game);
        cpu.cpuMove();
        game.rpsRecognizer(cpu,game);
        information.roundInformation(human,game);
        information.roundInformation(cpu,game);
        int[][] rules = new int[][]{
                {0, 1, 2},
                {2, 0, 1},
                {1, 2, 0}
        };
        int result = rules[Integer.parseInt(human.getMove()) - 1][Integer.parseInt(cpu.getMove()) - 1];
        if (result == 1) {
            cpu.addPoint();
            information.looseInformation();
        } else if (result == 2) {
            human.addPoint();
            information.winInformation();
        } else if (result == 0) {
            information.tieInformation();
        }
    }

    public String rpsRecognizer(Player player, Game game) {
        String rps="";
        switch (player.getMove()) {
            case "1":
                rps = " ROCK ";
                break;
            case "2":
                rps = "PAPER";
                break;
            case "3":
                rps = "SCISSORS";
                break;
            case "x":
                game.endGame();
                break;
        }return rps;
    }

    public int getPointsToWin() {
        return pointsToWin;
    }

    public boolean endGame () {
        String yesOrNo;
        boolean end = false;
        System.out.println("Are you sure you want to quit??? y/n");
        Scanner scanner = new Scanner(System.in);
        yesOrNo = scanner.next();
        if (yesOrNo.equals("y")){
             end = true;
        }return end;
    }

    public void newGame (Game game, Human human, CpuPlayer cpu, Information information, InputData inputData) {
        String yesOrNo;
        System.out.println("Are you sure you want to quit??? for yes press - y for no press any other key");
        Scanner scanner = new Scanner(System.in);
        yesOrNo = scanner.next();
        if (yesOrNo.equals("y")){
            game.begining(human,information,inputData);
            human.setPoints(0);
            cpu.setPoints(0);
        }
    }

}

