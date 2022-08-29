package com.kodilla.good.patterns.allegro;

public class MailService implements InformationService{
    @Override
    public void info(UserData userData,Product product){
        System.out.println("Thank "+ userData.getRealName()+" for your order. Have a Nice Day :) ");
    }
}
