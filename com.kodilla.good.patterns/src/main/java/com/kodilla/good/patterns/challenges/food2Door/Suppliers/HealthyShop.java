package com.kodilla.good.patterns.challenges.food2Door.Suppliers;

import com.kodilla.good.patterns.challenges.food2Door.Orders.Order;

public class HealthyShop extends Supplier {
    public HealthyShop(String name) {
        super(name);
    }

    @Override
    public boolean process(Order order) {
        System.out.println("You receive free delivery above 100 PLN");
        return super.process(order);
    }
}
