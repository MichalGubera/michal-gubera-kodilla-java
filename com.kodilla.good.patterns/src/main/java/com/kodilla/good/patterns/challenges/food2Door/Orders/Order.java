package com.kodilla.good.patterns.challenges.food2Door.Orders;

import com.kodilla.good.patterns.challenges.food2Door.Suppliers.Shop;

public class Order {
    private String productName;
    private int quantity;
    private Shop shop;

    public Order(String productName, int quantity, Shop shop) {
        this.productName = productName;
        this.quantity = quantity;
        this.shop = shop;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public Shop getShop() {
        return shop;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", shop=" + shop +
                '}';
    }
}
