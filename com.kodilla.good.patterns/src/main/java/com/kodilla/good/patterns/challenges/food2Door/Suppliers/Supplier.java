package com.kodilla.good.patterns.challenges.food2Door.Suppliers;

import com.kodilla.good.patterns.challenges.food2Door.Orders.Order;

public interface Supplier {
    String getName();
    boolean process(Order order);
}
