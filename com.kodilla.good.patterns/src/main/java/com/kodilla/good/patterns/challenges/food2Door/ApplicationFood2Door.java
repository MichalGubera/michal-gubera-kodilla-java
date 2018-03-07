package com.kodilla.good.patterns.challenges.food2Door;

import com.kodilla.good.patterns.challenges.food2Door.Implementation.OrderInformationImplementation;
import com.kodilla.good.patterns.challenges.food2Door.Implementation.OrderRepositoryImplementation;
import com.kodilla.good.patterns.challenges.food2Door.Implementation.OrderServiceImplementation;
import com.kodilla.good.patterns.challenges.food2Door.Orders.OrderRequest;
import com.kodilla.good.patterns.challenges.food2Door.Orders.OrderRequestRetriever;
import com.kodilla.good.patterns.challenges.food2Door.Processor.OrderServiceProcessor;

public class ApplicationFood2Door {
    public static void main(String args[]){
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrive();
        OrderServiceProcessor orderServiceProcessor = new OrderServiceProcessor(
                new OrderInformationImplementation(),
                new OrderRepositoryImplementation(),
                new OrderServiceImplementation());
        orderServiceProcessor.processOrder(orderRequest);
    }
}
