package com.kodilla.good.patterns.challenges.productOrderService;

import java.time.LocalDate;

public interface BuyService {
    boolean buy(User user, int price, LocalDate dayOfDelivery);
}
