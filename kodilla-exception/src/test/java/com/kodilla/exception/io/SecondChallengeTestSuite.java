package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    public void testProbablyWillThrowExceptionWithNumbers(){
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        //when & then
        assertAll(
                () -> assertThrows((Exception.class), ()-> secondChallenge.propablyWillThrowException(1.2,1.5)),
                () -> assertThrows((Exception.class), ()-> secondChallenge.propablyWillThrowException(2.0,2.4)),
                () -> assertThrows((Exception.class), ()-> secondChallenge.propablyWillThrowException(0.9,2.4)),
                () -> assertDoesNotThrow(()->secondChallenge.propablyWillThrowException(1.0,1.4))
        );


    }
}
