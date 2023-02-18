package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    public void add() {
        calculator.add(10,5);
    }
    @Test
    public void sub() {
        calculator.sub(10,5);
    }
    @Test
    public void mul() {
        calculator.mul(10,5);
    }
    @Test
    public void div() {
        calculator.div(10,5);
    }
}
