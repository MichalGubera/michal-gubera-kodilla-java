package com.kodilla.good.patterns.challenges.food2Door.Processor;

import com.kodilla.good.patterns.challenges.food2Door.Orders.Order;
import com.kodilla.good.patterns.challenges.food2Door.Suppliers.Shop;

public interface OrderService {
    boolean processOrderService(Order order);
}
