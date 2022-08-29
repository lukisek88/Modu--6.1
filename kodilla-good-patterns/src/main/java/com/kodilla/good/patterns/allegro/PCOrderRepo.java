package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;
import java.util.Random;

public class PCOrderRepo implements ProductOrderRepo {
    @Override
    public boolean createProductOrder(UserData userData, LocalDateTime orderDate, Product product, int quantity) {
        return new Random().nextBoolean();
    }
}
