package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    public void testGetLastLog() {
        //Given
        logger = Logger.INSTANCE;
        //When
        logger.log("FANTASTIC");
        String result = logger.getLastlog();
        //Then
        Assertions.assertEquals("FANTASTIC",result);
    }
}
