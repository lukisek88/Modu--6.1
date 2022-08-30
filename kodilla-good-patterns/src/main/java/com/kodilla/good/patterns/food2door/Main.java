package com.kodilla.good.patterns.food2door;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.processAllOrders(new OrderRecive().recive());
    }
}
