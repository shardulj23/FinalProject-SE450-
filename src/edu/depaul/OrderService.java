package edu.depaul;

import java.util.List;

public class OrderService {
    private final PaymentService paymentService = new PaymentService();

    public void placeOrder(String customer) {
        ShoppingCart cart = ShoppingCart.getInstance();
        List<Product> products = cart.getProducts();

        if (products.isEmpty()) {
            System.out.println("The cart is empty. Cannot place order.");
            return;
        }

        double totalAmount = calculateTotalAmount(products);
        boolean paymentSuccess = paymentService.processPayment(customer, totalAmount);

        if (paymentSuccess) {
            Order order = new Order(products, customer);
            logOrder(order);
            cart.clearCart();
            System.out.println("Order placed successfully.");
        } else {
            System.out.println("Payment failed. Order not placed.");
        }
    }

    private double calculateTotalAmount(List<Product> products) {
        return 0.0;
    }

    private void logOrder(Order order) {
    }

}

