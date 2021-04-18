package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream\n");

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("jelonek", ((tekst) -> "///"+tekst+"///"));
        poemBeautifier.beautify("biedronka",String::toUpperCase);
        poemBeautifier.beautify("stokrotka",(tekst -> tekst.replace(""," ")));
        poemBeautifier.beautify("nosorożer",(tekst -> tekst.replace("o","*")));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        com.kodilla.stream.iterate.NumbersGenerator.generateEven(20);
    }
}
