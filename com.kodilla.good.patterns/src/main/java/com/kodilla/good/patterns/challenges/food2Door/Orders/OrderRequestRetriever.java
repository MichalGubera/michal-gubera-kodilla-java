package com.kodilla.good.patterns.challenges.food2Door.Orders;

import com.kodilla.good.patterns.challenges.food2Door.Suppliers.HealthyShop;
import com.kodilla.good.patterns.challenges.food2Door.Suppliers.Shop;

public class OrderRequestRetriever {
    public OrderRequest retrive(){
        Shop shop = new HealthyShop("HealthyShop");
        Order order = new Order("almonds", 7, shop);
        return new OrderRequest(order, shop);
    }
}
