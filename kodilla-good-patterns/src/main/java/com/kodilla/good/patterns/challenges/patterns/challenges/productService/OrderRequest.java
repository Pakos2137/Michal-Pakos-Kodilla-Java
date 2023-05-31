package com.kodilla.good.patterns.challenges.patterns.challenges.productService;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private Product product;
    private LocalDateTime dateOrder;
    private LocalDateTime dateDelivery;

    public OrderRequest(final User user, final Product product, final LocalDateTime dateOrder){
        this.user = user;
        this.product = product;
        this.dateOrder = dateOrder;
    }

    public User getUser(){
        return user;
    }

    public Product getProduct(){
        return product;
    }

    public LocalDateTime getDateOrder(){
        return dateOrder;
    }

    public LocalDateTime getDateDelivery(){
        return dateDelivery;
    }
}