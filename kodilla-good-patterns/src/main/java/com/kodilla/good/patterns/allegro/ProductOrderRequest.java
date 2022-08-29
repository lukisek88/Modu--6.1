package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public class ProductOrderRequest {

    private UserData userData;
    private LocalDateTime orderDate;
    private Product product;
    private int quantity;

    public ProductOrderRequest(UserData userData, LocalDateTime orderDate, Product product, int quantity) {
        this.userData = userData;
        this.orderDate = orderDate;
        this.product = product;
        this.quantity = quantity;
    }

    public UserData getUser() {
        return userData;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
