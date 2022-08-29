package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;
import java.util.Random;

public class PCOrderService implements ProductOrderService{
    @Override
    public boolean sold(UserData userData, LocalDateTime oderDate,Product product,int quantity){
        return new Random().nextBoolean();
    }
}
