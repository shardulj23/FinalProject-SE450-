package edu.depaul;

public class OrderService {
    public void placeOrder(String customer) {
        ShoppingCart cart = ShoppingCart.getInstance();
        Order order = new Order(cart.getProducts(), customer);
        // Process the order...
    }
}

