package com.kodilla.good.patterns.challenges.food2Door.Orders;

import com.kodilla.good.patterns.challenges.food2Door.Suppliers.Supplier;

public class Order {
    private String productName;
    private int quantity;
    private Supplier supplier;

    public Order(String productName, int quantity, Supplier supplier) {
        this.productName = productName;
        this.quantity = quantity;
        this.supplier = supplier;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", supplier=" + supplier +
                '}';
    }
}
