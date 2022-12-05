package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        ArrayList<Integer>oddNumberList = new ArrayList<>();

        for(int number : numbers) {
            if (number % 2 == 0) {
                oddNumberList.add(number);
            }
        }
        return oddNumberList;
    }
}
