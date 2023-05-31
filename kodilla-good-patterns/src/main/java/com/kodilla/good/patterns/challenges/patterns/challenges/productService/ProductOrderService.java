package com.kodilla.good.patterns.challenges.patterns.challenges.productService;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(final User user, final Product product, final LocalDateTime dateOrder){
        System.out.println("Imię i nazwisko zamawiającego: " + user.getFirstname() + " " + user.getLastname());
        System.out.println("Data zamówienia : " + dateOrder);
        System.out.println("Zamówiono : " + product.getProductName());
        System.out.println("Koszt zamówionego przedmiotu : " + product.getPrice());

        return true;
    }
}