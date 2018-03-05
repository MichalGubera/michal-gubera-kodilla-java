package com.kodilla.good.patterns.challenges.product_order_service;

public interface OrderRepository {
    void createOrder(User user, int quantity);
}
