package com.kodilla.good.patterns.challenges.patterns.challenges.productService;

import java.time.LocalDateTime;

public interface OrderService {
    boolean order(final User user, final Product product, final LocalDateTime dateOrder);
}