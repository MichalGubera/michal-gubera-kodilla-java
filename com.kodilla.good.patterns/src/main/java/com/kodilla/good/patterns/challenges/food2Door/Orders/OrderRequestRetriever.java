package com.kodilla.good.patterns.challenges.food2Door.Orders;

import com.kodilla.good.patterns.challenges.food2Door.Suppliers.Supplier;

public class OrderRequestRetriever {
    public OrderRequest retrive(){
        Supplier supplier = new Supplier("HealthyShop");
        Order order = new Order("Heineken", 7, supplier);
        return new OrderRequest(order, supplier);
    }
}
