package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public class ProductOrderInfo {
    private UserData userData;
    private LocalDateTime orderDate;
    private Product product;
    private int quantity;
    private boolean isSuccesfullySold;

    public ProductOrderInfo(UserData userData, LocalDateTime orderDate, Product product, int quantity, boolean isSuccesfullySold) {
        this.userData = userData;
        this.orderDate = orderDate;
        this.product = product;
        this.quantity = quantity;
        this.isSuccesfullySold = isSuccesfullySold;
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

    public boolean isSuccesfullySold() {
        return isSuccesfullySold;
    }
}
