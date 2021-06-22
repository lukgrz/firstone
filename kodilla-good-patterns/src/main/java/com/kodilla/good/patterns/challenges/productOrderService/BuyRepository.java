package com.kodilla.good.patterns.challenges.productOrderService;

import java.time.LocalDate;

public interface BuyRepository {
    boolean createBusket (User user, int price, LocalDate dayOfDelivery);
}
