package com.kodilla.rps;
import java.util.Scanner;

public class InputData {
    Scanner scanner = new Scanner(System.in);

    public void enterName (Human human){
        human.setName(scanner.next());
    }

    public int enterPointsToWin(){
        return scanner.nextInt();
    }

    public void enterHumanMove(Human human){
        human.setMove(scanner.next());
    }
}
