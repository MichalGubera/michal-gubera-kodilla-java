package com.kodilla.good.patterns.challenges.food2Door.Implementation;

import com.kodilla.good.patterns.challenges.food2Door.Orders.Order;
import com.kodilla.good.patterns.challenges.food2Door.Processor.OrderService;
import com.kodilla.good.patterns.challenges.food2Door.Suppliers.Supplier;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImplementation implements OrderService {
    private List<Supplier> supplierList = new ArrayList<>();

    @Override
    public void addSupplier(Supplier supplier) {
        if (!(supplierList.contains(supplier))) {
            System.out.println("adding supplier to list");
            supplierList.add(supplier);
        }
    }

    @Override
    public boolean process(Order order) {
        for (Supplier supplier : supplierList){
            if (supplier.getName().equals(order.getSupplier().getName())){
                System.out.println("processing the order...");
                supplier.process(order);
            }
        }
        return true;
    }
}
