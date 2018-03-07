package com.kodilla.good.patterns.challenges.food2Door.Suppliers;

import com.kodilla.good.patterns.challenges.food2Door.Orders.Order;

public class ExtraFoodShop extends Shop {
    public ExtraFoodShop(String name) {
        super(name);
    }

    @Override
    public boolean process(Order order) {
        System.out.println("Thank you for choosing ExtraFoodShop. You are getting -1% off for each 100 PLN spent in our shop.");
        return super.process(order);
    }
}
