package com.kodilla.stream.array;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int numbers [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,20};
        double averageExpected = 8.75;
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        assertEquals(averageExpected, average, 0.01);
    }
}