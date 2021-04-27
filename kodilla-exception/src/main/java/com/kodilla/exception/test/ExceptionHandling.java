package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main (String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            secondChallenge.propablyWillThrowException(2,1.6);
        }catch (Exception e) {
            System.out.println("You have found the exception");
        }
    }
}
