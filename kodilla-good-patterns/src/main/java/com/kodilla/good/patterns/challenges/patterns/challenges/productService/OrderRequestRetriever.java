package com.kodilla.good.patterns.challenges.patterns.challenges.productService;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){
        User user = new User("Zbisiek", "Aksel");

        Product product = new Product("elektornika", "Komputer", 5000);

        LocalDateTime dateOrder = LocalDateTime.of(2023, 5, 31, 21, 54);

        return new OrderRequest(user, product, dateOrder);
    }
}