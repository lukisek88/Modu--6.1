package com.kodilla.good.patterns.allegro;

public class Product {
    private String productName;
    private String productDiscirption;
    private double productPrice;

    public Product(String productName, String productDiscirption, double productPrice) {
        this.productName = productName;
        this.productDiscirption = productDiscirption;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return  "Ordered Product: "+productName+"\n"+
                "Product Discription: "+productDiscirption+"\n"+
                "Unit Price: "+productPrice+" zl";
    }
}
