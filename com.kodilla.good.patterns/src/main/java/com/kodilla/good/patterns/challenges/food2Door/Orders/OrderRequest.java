package com.kodilla.good.patterns.challenges.food2Door.Orders;

import com.kodilla.good.patterns.challenges.food2Door.Suppliers.Supplier;

public class OrderRequest {
    private Order order;
    private Supplier supplier;

    public OrderRequest(final Order order, final Supplier supplier) {
        this.order = order;
        this.supplier = supplier;
    }

    public Order getOrder() {
        return order;
    }

    public Supplier getSupplier() {
        return supplier;
    }
}
