package com.kodilla.good.patterns.challenges.food2Door.Suppliers;

import com.kodilla.good.patterns.challenges.food2Door.Orders.Order;

public class Supplier {
    private String name;

    public Supplier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean process(Order order){
        return true;
    }

    @Override
    public String toString() {
        return name;
    }
}
