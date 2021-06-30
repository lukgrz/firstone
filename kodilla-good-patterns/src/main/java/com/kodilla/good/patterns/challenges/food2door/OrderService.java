package com.kodilla.good.patterns.challenges.food2door;

import java.sql.SQLOutput;
import java.util.Map;

public class OrderService {

    public boolean orderIsAvaliable(OrderRequest orderRequest){
        boolean isAvaliable = true;

        for (Map.Entry<Product,Integer> entry:orderRequest.getProducts().entrySet()) {
            if (orderRequest.getShop().getAvaliableProducts().containsKey(entry.getKey())) {
                if (entry.getValue()<=orderRequest.getShop().getAvaliableProducts().get(entry.getKey())){
                    System.out.println(entry.getKey() + " is avaliable");
                } else {
                    System.out.println(entry.getKey() + " isn't avaliable");
                    isAvaliable = false;
                }
            } else {
                System.out.println(entry.getKey() + " isn't avaliable");
                isAvaliable = false;
            }
        }
        return isAvaliable;
    }
}
