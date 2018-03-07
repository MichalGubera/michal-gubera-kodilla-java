package com.kodilla.good.patterns.challenges.food2Door.Processor;

import com.kodilla.good.patterns.challenges.food2Door.Orders.OrderRequest;
import com.kodilla.good.patterns.challenges.food2Door.Suppliers.Shop;

public class OrderServiceProcessor {
    private OrderInformation orderInformation;
    private OrderRepository orderRepository;
    private OrderService orderService;

    public OrderServiceProcessor(final OrderInformation orderInformation,
                                 final OrderRepository orderRepository,
                                 final OrderService orderService) {
        this.orderInformation = orderInformation;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }

    public OrderDto processOrder(final OrderRequest orderRequest){
        boolean isOrdered = orderService.processOrderService(orderRequest.getOrder());
        if (isOrdered){
            orderInformation.inform(orderRequest.getOrder());
            orderRepository.createOrder(orderRequest.getOrder());

            return new OrderDto(orderRequest.getShop(),true);
        } else {
            return new OrderDto(orderRequest.getShop(),false);
        }
    }
}
