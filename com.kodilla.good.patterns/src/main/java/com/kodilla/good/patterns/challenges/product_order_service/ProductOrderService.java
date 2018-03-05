package com.kodilla.good.patterns.challenges.product_order_service;

public class ProductOrderService implements OrderService {
    public boolean order(final User user, final int quantity){
        System.out.println("User: " + user.getName() + "; oder: " + quantity + ";");
        return true;
    }
}
