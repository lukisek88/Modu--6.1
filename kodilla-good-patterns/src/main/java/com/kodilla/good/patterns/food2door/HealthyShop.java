package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HealthyShop implements FoodProducent {
    private Map<Product, Integer> productsList;

    public HealthyShop() {
        productsList = createProductList();
    }

    private Map<Product, Integer> createProductList() {

        Map<Product, Integer> productsList = new HashMap<>();
        productsList.put(new GlutenFreeProduct("Makaron", "Pasta"), 20);
        productsList.put(new GlutenFreeProduct("Kukurydza", "Corn"), 15);
        productsList.put(new GrainProduct("MakaronBio", true), 20);
        productsList.put(new GrainProduct("MąkaBio", true), 4);

        return productsList;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productsOrders) {
        return (productsOrders.size() >= 2 && isProductsAvailable(productsOrders));
    }

    private boolean isProductsAvailable(Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("Healthy Shop: We're sorry. Product is unavailable.");
                return false;
            }
        }
        return true;
    }
}