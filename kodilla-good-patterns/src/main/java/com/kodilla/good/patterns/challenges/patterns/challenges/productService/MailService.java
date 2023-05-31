package com.kodilla.good.patterns.challenges.patterns.challenges.productService;

public class MailService implements InformationService{

    public void info(final User user){
        System.out.println("Wysłano powiadomienie o zamówieniu do: " + user.getFirstname() + " " + user.getLastname());
    }
}