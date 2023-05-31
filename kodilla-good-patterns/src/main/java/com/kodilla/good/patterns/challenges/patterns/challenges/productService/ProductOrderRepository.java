package com.kodilla.good.patterns.challenges.patterns.challenges.productService;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {

    public boolean createOrder (final User user, final Product product, final LocalDateTime dateOrder){
        System.out.println("Zamówienie zostało dodane");
        return true;
    }
}