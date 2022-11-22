package com.kodilla.testing;

public class TestingMain {
    public static void main(String[] args) {

        Calculator Calculator = new Calculator();

        int result1 = Calculator.addAToB(10,5);
        System.out.println(result1);

        int result2 = Calculator.substractAFromB(10,5);
        System.out.println(result2);



        if(result1 == (15)) {
            System.out.println("Adding test OK");
        } else {
            System.out.println("Adding test Failed");
        }
        if(result2 == (5)){
            System.out.println("Substract test Ok");
        } else {
                System.out.println("Substract test Failed");
        }

    }
}
