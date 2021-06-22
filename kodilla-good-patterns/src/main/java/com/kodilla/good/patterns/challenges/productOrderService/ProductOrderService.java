package com.kodilla.good.patterns.challenges.productOrderService;

public class ProductOrderService {
    private InformationService informationService;
    private BuyService buyService;
    private BuyRepository buyRepository;

    public ProductOrderService(InformationService informationService, BuyService buyService, BuyRepository buyRepository) {
        this.informationService = informationService;
        this.buyService = buyService;
        this.buyRepository = buyRepository;
    }

    public BuyDto process(final Busket busket) {
        boolean isBought = buyService.buy(busket.getUser(), busket.getPrice(),
                busket.getDayOfDelivery());

        if (isBought) {
            informationService.inform(busket.getUser());
            buyRepository.createBusket(busket.getUser(), busket.getPrice(), busket.getDayOfDelivery());
            return new BuyDto(busket.getUser(), true);
        } else {
            return new BuyDto(busket.getUser(), false);
        }
    }
}
