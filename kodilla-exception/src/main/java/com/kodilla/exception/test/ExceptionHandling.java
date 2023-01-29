package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2,2);
        } catch (Exception e ) {
            System.out.println("Error x or y is not x >= 2,x < 1,y == 1.5");
        }
        finally {
            System.out.println("Program end...");
        }
    }
}
