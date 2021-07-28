package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {

    private int number = EMPTY;
    public static int EMPTY = -1;
    private List<Integer> possibleNumbers = new ArrayList();

    public SudokuElement() {
        for (int i = 0; i < 10; i++) {
            possibleNumbers.add(i + 1);
        }
    }

    public List<Integer> getPossibleNumbers() {
        return possibleNumbers;
    }

    @Override
    public String toString() {
        if (number == EMPTY) {
            return " ";
        } else {
            return "" + 1;
        }
    }
}
