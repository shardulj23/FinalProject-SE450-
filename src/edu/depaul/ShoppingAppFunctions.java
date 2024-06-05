package edu.depaul;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingAppFunctions {
    private final AuthenticationService authService = new AuthenticationService();
    private final Map<String, Product> productCatalog = new HashMap<>();

    public ShoppingAppFunctions() {
        productCatalog.put("Laptop", ProductFactory.createProduct("electronics", "Laptop", 1000.0));
        productCatalog.put("T-Shirt", ProductFactory.createProduct("clothing", "T-Shirt", 20.0));
    }

    public void register(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        if (authService.register(username, password)) {
            System.out.println("User registered successfully.");
        } else {
            System.out.println("Username already exists.");
        }
    }

    public void login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        if (authService.login(username, password)) {
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public void browseProducts() {
        System.out.println("Products:");
        for (Product product : productCatalog.values()) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }

    public void addProductToCart(Scanner scanner) {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        Product product = productCatalog.get(name);
        if (product != null) {
            CartBuilder cartBuilder = new CartBuilder();
            cartBuilder.addProduct(product);
            System.out.println("Product added to cart.");
        } else {
            System.out.println("Product not found in catalog.");
        }
    }

    public void removeProductFromCart(Scanner scanner) {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        Product product = productCatalog.get(name);
        if (product != null) {
            CartBuilder cartBuilder = new CartBuilder();
            cartBuilder.removeProduct(product);
            System.out.println("Product removed from cart.");
        } else {
            System.out.println("Product not found in catalog.");
        }
    }

    public void viewCart() {
        ShoppingCart cart = ShoppingCart.getInstance();
        System.out.println("Cart contents:");
        for (Product product : cart.getProducts()) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }
    
}
