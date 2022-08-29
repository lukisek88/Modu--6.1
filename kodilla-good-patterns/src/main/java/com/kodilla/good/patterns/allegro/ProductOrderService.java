package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

interface ProductOrderService {
    boolean sold(UserData userData, LocalDateTime orderDate, Product product, int quantity);
}
