package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main (String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")) {
            System.out.println("test OK YYYEEAAAAHH");
        } else {
            System.out.println("Error 303");
        }
        System.out.println("Test - pierwszy test jednostkowy");
        Calculator calculator = new Calculator();

        int addResult = calculator.add(2,7);
        int substractResult = calculator.substract(9,5);

        if (addResult == 9) {
            System.out.println("\nAdd test\nReally good adding");
        } else {
            System.out.println("\nAdd test\nAdding not works");
        }

        if (substractResult == 4) {
            System.out.println("\nSubstract test\nGood job dude");
        } else {
            System.out.println("\nSubstract test\nSomething goes terribly wrong");
        }
    }
}
