package com.kodilla.good.patterns.challenges.food2Door.Implementation;

import com.kodilla.good.patterns.challenges.food2Door.Orders.Order;
import com.kodilla.good.patterns.challenges.food2Door.Processor.OrderRepository;

public class OrderRepositoryImplementation implements OrderRepository {
    @Override
    public boolean createOrder(Order order) {
        System.out.println("order has been stored in DataBase.");
        return true;
    }
}
