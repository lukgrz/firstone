package com.kodilla.good.patterns.challenges.productOrderService;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderResponse process (OrderRequest orderRequest){
        OrderRequestDto orderRequestDto = new OrderRequestDto(orderRequest.getProducts());
        boolean iSOrdered = orderService.order(orderRequestDto);

        if (iSOrdered) {
            informationService.inform(orderRequest.getUserDto());
            orderRepository.withdraw(orderRequestDto);
            return new OrderResponse(orderRequest, true, orderService.calculateValue(orderRequestDto));
        } else {
            return new OrderResponse(orderRequest, false, orderService.calculateValue(orderRequestDto));
        }
    }
}
