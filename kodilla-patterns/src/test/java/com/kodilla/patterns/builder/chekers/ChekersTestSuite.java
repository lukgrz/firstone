package com.kodilla.patterns.builder.chekers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ChekersTestSuite {

    @Test
    void testCheckersBuilder() {
        //Given
        Chekers chekers = new Chekers.ChekersBuilder()
                .PlayerOne("John")
                .PlayerTwo("Steven")
                .Figure(FigureFactory.PAWN, Figure.WHITE, 0, 3)
                .Figure(FigureFactory.PAWN, Figure.BLACK, 9, 7)
                .Figure(FigureFactory.QUEEN, Figure.WHITE, 0, 2)
                .build();
        System.out.println(chekers.getBoard());

        //When
        Figure figureOne =  chekers.getBoard().getFigure(0, 3);
        Figure figureTwo = chekers.getBoard().getFigure(9, 7);
        Figure figureThree = chekers.getBoard().getFigure(0, 2);
        Figure figureFour = chekers.getBoard().getFigure(1, 1);

        //Then
        assertEquals(Figure.WHITE, figureOne.getColor());
        assertEquals(Pawn.class, figureTwo.getClass());
        assertEquals(Queen.class, figureThree.getClass());
        assertNull(figureFour);
    }
}
