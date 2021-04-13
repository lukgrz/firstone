package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.*;
import java.lang.*;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: Begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: End\n");
    }

    @DisplayName(
            "Test when the input list is empty"
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List <Integer> result = oddNumbersExterminator.exterminate(emptyList);
        //Then
        Assertions.assertTrue(result.isEmpty());
        System.out.println("Lista jest pusta");
    }

    @DisplayName(
            "Test when you input random list"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {

        //Given
        List<Integer> theList = Arrays.asList(4,3,5,6,12,15,29872);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> expectedList = Arrays.asList(4,6,12,29872);
        //When
        List <Integer> result = oddNumbersExterminator.exterminate(theList);
        //Then
        Assertions.assertEquals(expectedList,result);
        System.out.println("All numbers are even"+result);
    }
}
