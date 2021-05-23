package com.kodilla.rps;

public class RpsRunner {

    public static void main(String[] args){
        Game game = new Game();
        Human human = new Human("",0);
        CpuPlayer cpu = new CpuPlayer();
        Information  information = new Information();
        InputData inputData = new InputData();
        boolean end = false;

        game.begining(human,information,inputData);

        while (!end) {
            game.makeMove(human,cpu,information,inputData);
            if (human.getMove().equals("x")) {
                end = game.endGame();
            }else if (human.getMove().equals("n")) {
                game.newGame(game, human, cpu, information,inputData);
            } else {
                game.round(human,cpu,information,game);
                end = (human.getPoints()== game.getPointsToWin()||cpu.getPoints()== game.getPointsToWin());
            }
        }
        information.scoreInformation(human,cpu);
        information.endGameInformation(game,human,cpu);
    }
}
