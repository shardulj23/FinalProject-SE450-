package edu.depaul;

public class PaymentService {
    public boolean processPayment(String customer, double amount) {
        System.out.println("Processing payment for customer: " + customer);
        System.out.println("Amount: $" + amount);

        boolean paymentSuccess = Math.random() < 0.8;
        if (paymentSuccess) {
            System.out.println("Payment successful.");
        } else {
            System.out.println("Payment failed.");
        }
        return paymentSuccess;
    }
}


