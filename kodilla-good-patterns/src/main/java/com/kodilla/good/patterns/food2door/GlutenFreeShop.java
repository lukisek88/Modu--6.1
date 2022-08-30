package com.kodilla.good.patterns.food2door;


import java.util.*;

public class GlutenFreeShop implements FoodProducent {
    private Map<Product, Integer> productsList;


    public GlutenFreeShop() {
        productsList = createProductList();

    }

    private Map<Product, Integer> createProductList() {

        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new GlutenFreeProduct("Chleb", "Bread"), 50);
        productsList.put(new GlutenFreeProduct("Ryż", "Rice"), 150);
        productsList.put(new GlutenFreeProduct("Ciastka", "Cookies"), 20);
        productsList.put(new GlutenFreeProduct("Kokosanki", "Coco Cookies"), 4);

        return productsList;
    }



    @Override
    public boolean process(Customer customer, Map<Product, Integer> productsOrders) {
        return  isProductsAvailable(productsOrders);
    }

    private boolean isProductsAvailable(Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println(" GlutenFreeShop: We're sorry. Product is unavailable.");
                return false;
            }
        }
        return true;
    }
}