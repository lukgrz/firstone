package com.kodilla.good.patterns.challenges.productOrderService.information;

import com.kodilla.good.patterns.challenges.productOrderService.User;

public class MailService implements InformationService {

    public void inform(User user) {
        System.out.println("Mail sended to " + user);
    }
}
