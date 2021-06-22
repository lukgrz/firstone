package com.kodilla.good.patterns.challenges.productOrderService;

public class MailService implements InformationService{

    public void inform(User user) {
        System.out.println("Mail sended to " + user);
    }
}
