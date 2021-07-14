package com.kodilla.patterns.prototype;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BoardTestSuite {

    @Test
    void testtoString() {
        //Given
        //creating the TasksList for to do tasks
        TasksList listToDo = new TasksList("To Do Tasks");
        IntStream.iterate(1,n->n+1)
                .limit(10)
                .forEach(n-> listToDo.getTasks().add(new Task("To do task number " + n)));

        //creating the TasksList for tasks in progerss
        TasksList listInProgress = new TasksList("In Progress Tasks");
        IntStream.iterate(1,n->n+1)
                .limit(10)
                .forEach(n-> listInProgress.getTasks().add(new Task("In progress task number " + n)));

        //creating the TasksList for done tasks
        TasksList listDone = new TasksList("Done Tasks");
        IntStream.iterate(1,n->n+1)
                .limit(10)
                .forEach(n-> listDone.getTasks().add(new Task("Done task number " + n)));

        //Creating the board and assigning the lists
        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);
        System.out.println(board);

        //Makeing a shallow copy
        Board clonedBoard = null;
        try {
            clonedBoard = board.shallowCopy();
            clonedBoard.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Makeing a deep copy
        Board deepClonedBoard = null;
        try {
            deepClonedBoard = board.deepCopy();
            deepClonedBoard.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        board.getLists().remove(listToDo);

        //Then
        System.out.println(board);
        System.out.println(clonedBoard);
        System.out.println(deepClonedBoard);

        assertEquals(2, board.getLists().size());
        assertEquals(2, clonedBoard.getLists().size());
        assertEquals(3, deepClonedBoard.getLists().size());
        assertEquals(clonedBoard.getLists(), board.getLists());
        assertNotEquals(deepClonedBoard.getLists(), board.getLists());
    }
}
