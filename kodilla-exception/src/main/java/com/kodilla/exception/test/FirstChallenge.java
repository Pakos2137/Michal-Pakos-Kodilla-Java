package com.kodilla.exception.test;

import java.io.IOException;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = 0;
        try {
            result = firstChallenge.divide(6, 0);
            System.out.println("Wynik: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Nie można dzielić przez 0 : " + e);
        } finally {
            System.out.println("Program zakończył działanie");
        }
    }
}