package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

public class PizzaOrderTestSuite {
    @Test
    public void pizzaDecoratorTest() {
        PizzaOrder order = new BasicPizza();
        order = new OrderExtraCheese(order);
        order = new OrderAdditions(order);

        System.out.printf(order.getDescription());
        System.out.println("Pizza cost: " + order.getCost());
    }
}
