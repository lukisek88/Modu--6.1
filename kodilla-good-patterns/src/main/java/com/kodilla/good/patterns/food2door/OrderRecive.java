package com.kodilla.good.patterns.food2door;

import java.util.*;

public class OrderRecive {
    public List<OrderRequest> recive() {
        List<OrderRequest> orderRequestList = new ArrayList<>();

        Customer customer = new Customer("John");
        FoodProducent foodProducent = new GlutenFreeShop();
        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new GlutenFreeProduct("Chleb", "Bread"), 50);
        productsList.put(new GlutenFreeProduct("Ryż", "Rice"), 150);
        productsList.put(new GlutenFreeProduct("Ciastka", "Cookies"), 20);
        productsList.put(new GlutenFreeProduct("Kokosanki", "Coco Cookies"), 4);

        orderRequestList.add(new OrderRequest(customer, foodProducent, productsList));


        Customer customer1 = new Customer("Arnold");
        FoodProducent foodProducent1 = new ExtraFoodShop();
        Map<Product, Integer> productsList1 = new HashMap<>();
        productsList1.put(new MeatProduct("Filet", "Kurczak"), 15);
        productsList1.put(new MeatProduct("Golonka", "Wiepszowa"), 8);

        orderRequestList.add(new OrderRequest(customer1, foodProducent1, productsList1));


        Customer customer2 = new Customer("Steve");
        FoodProducent foodProducent2 = new HealthyShop();
        Map<Product, Integer> productsList2 = new HashMap<>();
        productsList2.put(new GrainProduct("MakaronBio", true), 5);
        productsList2.put(new GrainProduct("MąkaBio", true), 1);

        orderRequestList.add(new OrderRequest(customer2, foodProducent2, productsList2));

        return orderRequestList;
    }
}
