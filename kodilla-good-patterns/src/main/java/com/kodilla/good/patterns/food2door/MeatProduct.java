package com.kodilla.good.patterns.food2door;

public class MeatProduct extends Product {
    private String typeOfMeat;

    public MeatProduct(String productName, String typeOfMeat) {
        super(productName);
        this.typeOfMeat = typeOfMeat;
    }
}