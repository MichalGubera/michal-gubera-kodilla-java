package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    public User user;
    public int quantity;

    public OrderRequest(final User user, final int quantity) {
        this.user = user;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public int getQuantity() {
        return quantity;
    }
}
