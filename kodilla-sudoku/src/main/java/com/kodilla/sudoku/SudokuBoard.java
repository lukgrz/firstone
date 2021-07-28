package com.kodilla.sudoku;

public class SudokuBoard {

    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 9;
    private final SudokuElement[][] board = new SudokuElement[10][];

    public SudokuBoard() {
        for (int n = 0; n < 10; n++) {
            board[n] = new SudokuElement[10];
        }
    }

    public SudokuElement getElement(int x, int y) {
        return board[x][y];
    }

    public void setElement (SudokuElement sudokuElement, int x, int y) {
        board[x][y] = sudokuElement;
    }
}
