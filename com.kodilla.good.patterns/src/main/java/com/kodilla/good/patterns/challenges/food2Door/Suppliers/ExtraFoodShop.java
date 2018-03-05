package com.kodilla.good.patterns.challenges.food2Door.Suppliers;

import com.kodilla.good.patterns.challenges.food2Door.Orders.Order;

public class ExtraFoodShop extends Supplier {
    public ExtraFoodShop(String name) {
        super(name);
    }

    @Override
    public boolean process(Order order) {
        System.out.println("You are getting -1% off for each 100 PLN spent");
        return super.process(order);
    }
}
