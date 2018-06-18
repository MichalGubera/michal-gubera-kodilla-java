package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
/*      Test powinien:
        - przygotować tablicę z przykładowymi wartościami typu int
        - wywołać metodę getAverage(int[] numbers) interfejsu ArrayOperations
        - przy pomocy asercji sprawdzić, czy obliczona średnia jest poprawna           */

        //Given
        int[] numbers = {18, 22, 42, 26, 5, 86, 47, 23, 87, 31, 4, 59, 8, 19, 56, 28, 86, 52, 22, 14};
        //When
        double result = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(36.75, result, 0.01);
    }
}
