package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public interface ProductOrderRepo {
    boolean createProductOrder(UserData userData, LocalDateTime orderDate, Product product, int quantity);
}
