package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService{
    public void inform (User user){
        System.out.println("Sending a message to user: " + user.getName() + ";");
    }
}
