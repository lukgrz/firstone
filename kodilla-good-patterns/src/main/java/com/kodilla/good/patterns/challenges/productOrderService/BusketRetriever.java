package com.kodilla.good.patterns.challenges.productOrderService;

import java.time.LocalDate;

public class BusketRetriever {

        public Busket retrieve() {
            User user = new User("John Smith");
            int price = 20;
            LocalDate dayOfDelivery = LocalDate.of(2021, 6,24);

            return new Busket(user, price, dayOfDelivery);
        }
}
