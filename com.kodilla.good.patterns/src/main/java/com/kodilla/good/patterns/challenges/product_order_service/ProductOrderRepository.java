package com.kodilla.good.patterns.challenges.product_order_service;

public class ProductOrderRepository implements OrderRepository{
    public void createOrder(User user, int quantity){
        System.out.println("Order to: " + user.getName() + "; quantity: " + quantity + "; Transaction OK;" );
    }
}
