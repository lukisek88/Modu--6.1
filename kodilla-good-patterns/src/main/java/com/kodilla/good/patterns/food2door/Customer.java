package com.kodilla.good.patterns.food2door;

public class Customer {
    private String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return getCustomerName().equals(customer.getCustomerName());
    }

    @Override
    public int hashCode() {
        return customerName != null ? customerName.hashCode() : 0;
    }
}
