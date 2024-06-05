package edu.depaul;

import java.util.List;

public class Order {
    private List<Product> products;
    private String customer;

    public Order(List<Product> products, String customer) {
        this.products = products;
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getCustomer() {
        return customer;
    }
}

