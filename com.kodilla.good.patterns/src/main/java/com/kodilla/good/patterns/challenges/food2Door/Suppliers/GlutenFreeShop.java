package com.kodilla.good.patterns.challenges.food2Door.Suppliers;

import com.kodilla.good.patterns.challenges.food2Door.Orders.Order;

public class GlutenFreeShop extends Supplier {
    public GlutenFreeShop(String name) {
        super(name);
    }

    @Override
    public boolean process(Order order) {
        System.out.println("You receive free gluten free cookie with each order");
        return super.process(order);
    }
}
