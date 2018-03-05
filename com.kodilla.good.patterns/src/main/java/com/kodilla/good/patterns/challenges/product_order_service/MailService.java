package com.kodilla.good.patterns.challenges.product_order_service;

public class MailService implements InformationService{
    public void inform (User user){
        System.out.println("Sending a message to user: " + user.getName() + ";");
    }
}
