package com.kodilla.good.patterns.challenges.food2Door.Processor;

import com.kodilla.good.patterns.challenges.food2Door.Orders.OrderRequest;

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

    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrdered = orderService.process(orderRequest.getOrder());
        if (isOrdered){
            orderInformation.inform(orderRequest.getOrder());
            orderRepository.createOrder(orderRequest.getOrder());
            return new OrderDto(orderRequest.getSupplier(),true);
        } else {
            return new OrderDto(orderRequest.getSupplier(),false);
        }
    }
}
