package com.kodilla.good.patterns.challenges.food2Door.Implementation;

import com.kodilla.good.patterns.challenges.food2Door.Orders.Order;
import com.kodilla.good.patterns.challenges.food2Door.Processor.OrderService;
import com.kodilla.good.patterns.challenges.food2Door.Suppliers.Shop;
import com.kodilla.good.patterns.challenges.food2Door.Suppliers.Supplier;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImplementation implements OrderService {

    @Override
    public boolean processOrderService(Order order) {
        System.out.println("Processing order...");
        order.getShop().process(order);
        return true;
    }
}
