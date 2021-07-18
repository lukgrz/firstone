package com.kodilla.patterns.builder.chekers;

public class Chekers {

    private final Board board;
    private final String playerOne;
    private final String playerTwo;

    public Chekers(Board board, String playerOne, String playerTwo) {
        this.board = board;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public Board getBoard() {
        return board;
    }

    public String getPlayerOne() {
        return playerOne;
    }

    public String getPlayerTwo() {
        return playerTwo;
    }

    public static class ChekersBuilder {

        private Board board = new Board();
        private String playerOne = "";
        private String playerTwo = "";

        public ChekersBuilder PlayerOne(String playerOne) {
            this.playerOne = playerOne;
            return this;
        }

        public ChekersBuilder PlayerTwo(String playerTwo) {
            this.playerTwo = playerTwo;
            return this;
        }

        public ChekersBuilder Figure(String figureType, String figureColor, int x,int y) {
            if (x > Board.MAX_INDEX || x < Board.MIN_INDEX ||
            y > Board.MAX_INDEX || y < Board.MIN_INDEX) {
                throw new IllegalStateException("x and y should be in range " +
                        Board.MIN_INDEX + " and " + Board.MAX_INDEX);
            }
            if (board.getFigure(x,y) == null) {
                board.setFigure(FigureFactory.makeFigure(figureType,figureColor),x,y);
            } else {
                throw new IllegalStateException("Position " + x + "," + y);
            }
            return this;
        }

        public  Chekers build() {
            if (playerOne.length() == 0) {
                throw new IllegalStateException("There is no player one specified");
            }
            if (playerTwo.length() == 0) {
                throw new IllegalStateException("There is no player two specified");
            }
            boolean white = false, black = false;
            for (int x = Board.MIN_INDEX; x <= Board.MAX_INDEX; x++) {
                for (int y = Board.MIN_INDEX; x <= Board.MAX_INDEX; y++) {
                    Figure figure = board.getFigure(x, y);
                    if (figure != null) {
                        if (figure.getColor().equals(Figure.BLACK)) {
                            black = true;
                        } else {
                            white = true;
                        }
                    }
                }
            }
            if (!(black && white)) {
                throw new IllegalStateException("There are no figures of both players");
            }
            return new Chekers(board, playerOne, playerTwo);
        }
    }
}
