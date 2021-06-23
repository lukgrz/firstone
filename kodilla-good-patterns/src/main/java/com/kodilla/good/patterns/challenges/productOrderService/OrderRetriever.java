package com.kodilla.good.patterns.challenges.productOrderService;

import com.kodilla.good.patterns.challenges.productOrderService.products.Book;
import com.kodilla.good.patterns.challenges.productOrderService.products.Fruits;
import com.kodilla.good.patterns.challenges.productOrderService.products.Product;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class OrderRetriever {

        public Order retrieve() {
            LocalDate dayOfDelivery = LocalDate.of(2021, 6,24);
            Map<Product, Integer>orderProducts = new HashMap<>();
            Book book = new Book("Fight club",20);
            Fruits fruits = new Fruits("Banans",5);
            orderProducts.put(book,1);
            orderProducts.put(fruits,3);
            Basket basket = new Basket(dayOfDelivery, orderProducts);
            User user = new User("John Smith");

            return new Order(user, basket);
        }
}
