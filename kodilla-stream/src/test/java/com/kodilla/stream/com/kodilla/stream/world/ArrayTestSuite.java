package com.kodilla.stream.com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import com.kodilla.stream.array.ArrayOperations;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ArrayTestSuite {
    @Test
    public void averageTest() {
        int[] numbers = {10,5,6,8,35,34,87};

        double Avg = ArrayOperations.getAverage(numbers);

        System.out.println(Avg);

        double expected = 26.43;

        Assertions.assertEquals(Avg,expected,0.01);
    }
}
