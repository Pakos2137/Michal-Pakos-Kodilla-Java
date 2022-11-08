package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Calculator {
    int a = 8;
    int b = 9;
    public void add() {
        int c = a + b;
        System.out.println(a + "+" + b + "=" + c);
    }
    public void subtract() {
        int c = a - b;
        System.out.println(a + "-" + b + "=" + c);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.subtract();
    }
}
