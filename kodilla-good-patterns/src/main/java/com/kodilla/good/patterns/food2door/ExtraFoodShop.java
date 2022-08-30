package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ExtraFoodShop implements FoodProducent {
    private Map<Product, Integer> productsList;

    public ExtraFoodShop() {
        productsList = createProductList();
    }

    private Map<Product, Integer> createProductList() {
        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new MeatProduct("Filet", "Kurczak"), 10);
        productsList.put(new MeatProduct("Golonka", "Wiepszowa"), 5);
        productsList.put(new GrainProduct("Proso", true), 20);
        productsList.put(new GrainProduct("Owsianka", false), 0);


        return productsList;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer>productsOrders) {

        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()){
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("Extra Food Shop: We're sorry. Product is unavailable.");
                return false;
            }
        }
        return true;
    }
}