package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface DeliveryCompany {
    void process();
    List<ProductInformation> productsList();
    int deliveryTimeInDays();
    void addProduct(ProductInformation productInformation);
}
