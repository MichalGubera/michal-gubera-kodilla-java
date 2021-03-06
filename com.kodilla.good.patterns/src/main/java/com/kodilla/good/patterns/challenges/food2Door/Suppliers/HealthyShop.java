package com.kodilla.good.patterns.challenges.food2Door.Suppliers;

import com.kodilla.good.patterns.challenges.food2Door.Orders.Order;

public class HealthyShop extends Shop {
    public HealthyShop(String name) {
        super(name);
    }

    @Override
    public boolean process(Order order) {
        System.out.println("Thank you for choosing HealthyShop. You will receive free delivery above 100 PLN.");
        return super.process(preprocess(order));

    }
}
