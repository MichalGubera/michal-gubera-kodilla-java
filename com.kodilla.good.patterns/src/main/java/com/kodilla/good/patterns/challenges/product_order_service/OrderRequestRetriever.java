package com.kodilla.good.patterns.challenges.product_order_service;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){
        User user = new User("John McClane");
        int quantity = 3;
        return new OrderRequest(user, quantity);
    }
}
