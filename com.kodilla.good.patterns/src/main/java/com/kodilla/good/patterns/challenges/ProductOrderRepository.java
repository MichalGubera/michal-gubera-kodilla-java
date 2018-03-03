package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository implements OrderRepository{
    public void createOrder(User user, int quantity){
        System.out.println("Order to: " + user.getName() + "; quantity: " + quantity + "; Transaction OK;" );
    }
}
