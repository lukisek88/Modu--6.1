package com.kodilla.good.patterns.food2door;
import java.util.Map;

public class OrderRequest {
    private Customer customer;
    private FoodProducent foodProducent;
    private Map<Product, Integer> productOrderRequest;


    public OrderRequest(Customer customer, FoodProducent foodProducent, Map<Product, Integer> productOrderRequest) {
        this.customer = customer;
        this.foodProducent= foodProducent;
        this.productOrderRequest = productOrderRequest;
    }

    public Customer getCustomer() {
        return customer;
    }

    public FoodProducent getFoodProducer() {
        return foodProducent;
    }

    public Map<Product, Integer> getProductOrderRequest() {
        return productOrderRequest;
    }
}