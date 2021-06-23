package com.kodilla.good.patterns.challenges.productOrderService;

import com.kodilla.good.patterns.challenges.productOrderService.information.InformationService;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final Order order) {
        boolean isOrdered = orderService.order(order.getUser(),order.getBasket());

        if (isOrdered) {
            informationService.inform(order.getUser());
            orderRepository.createOrder(order.getUser(),order.getBasket());
            return new OrderDto(order.getUser(), order.getBasket(),true);
        } else {
            return new OrderDto(order.getUser(), order.getBasket(), false);
        }
    }
}
