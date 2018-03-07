package com.kodilla.good.patterns.challenges.food2Door.Suppliers;

import com.kodilla.good.patterns.challenges.food2Door.Orders.Order;

public abstract class Shop implements Supplier {
    private String name;

    public Shop(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean process(Order order) {
        return true;
    }

    @Override
    public String toString() {
        return name;
    }
}
