package com.kodilla.good.patterns.challenges.food2Door.Processor;

import com.kodilla.good.patterns.challenges.food2Door.Orders.Order;
import com.kodilla.good.patterns.challenges.food2Door.Suppliers.Supplier;

public interface OrderService {
    boolean process(Order order);
    void addSupplier(Supplier supplier);
}
