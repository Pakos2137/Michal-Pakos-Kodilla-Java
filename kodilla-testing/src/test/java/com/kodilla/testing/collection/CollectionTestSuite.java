package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;
import org.junit.*;
import org.junit.jupiter.api.Test;

import java.util.*;

public class CollectionTestSuite {
    public static void main(String[] args) {
        oddNumbersExterminator = new OddNumbersExterminator();
    }
    private static OddNumbersExterminator oddNumbersExterminator;

    @BeforeEach
    public void before() {
        System.out.println("Test Starting");
    }
    @AfterEach
    public void after() {
        System.out.println("Test Complete");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {

        ArrayList<Integer> emptyList = new ArrayList<>();

        List<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);
        Assert.assertEquals(emptyList, resultList);
    }
    @Test void testOddNumbersExterminatorNormalList() {
    ArrayList<Integer> normalList = new ArrayList<>();
    normalList.add(1);
    normalList.add(5);
    normalList.add(10);
    normalList.add(12);
    normalList.add(100);

    ArrayList<Integer>expectedResultList = new ArrayList<>();
    expectedResultList.add(10);
    expectedResultList.add(12);
    expectedResultList.add(100);

    List<Integer> resultList = oddNumbersExterminator.exterminate(normalList);
    Assert.assertEquals(expectedResultList, resultList);
    }
}

