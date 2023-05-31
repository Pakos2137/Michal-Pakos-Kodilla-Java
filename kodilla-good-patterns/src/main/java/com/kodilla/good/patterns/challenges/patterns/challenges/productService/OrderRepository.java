package com.kodilla.good.patterns.challenges.patterns.challenges.productService;

import java.time.LocalDateTime;

public interface OrderRepository {

    boolean createOrder(final User user, final Product product, final LocalDateTime dateOrder);
}