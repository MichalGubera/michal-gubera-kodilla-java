package com.kodilla.good.patterns.challenges.food2Door.Orders;

import com.kodilla.good.patterns.challenges.food2Door.Suppliers.Shop;

public class OrderRequest {
    private Order order;
    private Shop shop;

    public OrderRequest(final Order order, final Shop shop) {
        this.order = order;
        this.shop = shop;
    }

    public Order getOrder() {
        return order;
    }

    public Shop getShop() {
        return shop;
    }
}
