package com.kodilla.stream.array;
import com.kodilla.stream.array.ArrayOperations.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;

public class arrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] theArray = {1,2,3,4,5,6,7,8};

        //When
        double result = ArrayOperations.getAverage(theArray);

        //Then
        Assertions.assertEquals(4.5,result);

    }
}
