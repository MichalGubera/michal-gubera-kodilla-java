package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){
        User user = new User("John McClane");
        int quantity = 3;
        return new OrderRequest(user, quantity);
    }
}
