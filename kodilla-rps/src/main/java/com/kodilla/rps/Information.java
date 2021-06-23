package com.kodilla.rps;

public class Information {

    public void welcomeInformation() {
        System.out.println("Hello please enter your name: ");
    }

    public void pointsToWinInformation(Human human) {
        System.out.println("OK " + human.getName()+ " up to how many points you want to play???");
    }

    public void instructionInformation (int n) {
        System.out.println("\nYou are playing to " + n +"\n" +
                "Press key for action: \n" +
                "1-for rock\n" +
                "2-for paper\n" +
                "3-for scissors\n" +
                "x-end game\n" +
                "n-new game\n" +
                "CHOOSE WISE");
    }

    public void roundInformation (Player player, Game game) {
        System.out.print(player.getName()+" choose "+game.rpsRecognizer(player, game)+"\n");
    }

    public void scoreInformation(Human human, CpuPlayer cpu) {
        System.out.println(human.getPoints()+ " " +human.getName()+"\n"+
                cpu.getPoints()+" CPU");

    }

    public void winInformation() {
        System.out.println("Yeah point for you\n");

    }

    public void looseInformation() {
        System.out.println("You loose next time choose better\n");
    }

    public void tieInformation () {
        System.out.println("It was a tie\n");
    }

    public void endGameInformation(Game game, Human human, CpuPlayer cpu) {
        if (human.getPoints() == game.getPointsToWin()) {
            System.out.println("CONGRATS YOU WINNN THE GAME");
        }else if (cpu.getPoints() == game.getPointsToWin()) {
            System.out.println("L O S E R !!!!");
        }

    }

}
