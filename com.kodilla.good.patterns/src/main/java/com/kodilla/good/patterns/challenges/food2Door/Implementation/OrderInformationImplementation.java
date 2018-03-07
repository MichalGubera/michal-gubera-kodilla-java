package com.kodilla.good.patterns.challenges.food2Door.Implementation;

import com.kodilla.good.patterns.challenges.food2Door.Orders.Order;
import com.kodilla.good.patterns.challenges.food2Door.Processor.OrderInformation;

public class OrderInformationImplementation implements OrderInformation {
    @Override
    public void inform(Order order) {
        System.out.println("creating order: product - " + order.getProductName() +
                ", items - " + order.getQuantity() +
                ", shop - " + order.getShop() + ".");
    }
}
