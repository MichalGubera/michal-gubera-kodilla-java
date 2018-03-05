package com.kodilla.good.patterns.challenges.food2Door.Processor;

import com.kodilla.good.patterns.challenges.food2Door.Orders.Order;

public interface OrderRepository {
    boolean createOrder(Order order);
}
