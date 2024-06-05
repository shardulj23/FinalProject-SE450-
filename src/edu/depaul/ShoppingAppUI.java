package edu.depaul;

import java.util.Scanner;

public class ShoppingAppUI {
    private final ShoppingAppFunctions functions = new ShoppingAppFunctions();
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        boolean running = true;

        while (running) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Browse Products");
            System.out.println("4. Add Product to Cart");
            System.out.println("5. Remove Product from Cart");
            System.out.println("6. View Cart");
            System.out.println("7. Place Order");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        functions.register(scanner);
                        break;
                    case 2:
                        functions.login(scanner);
                        break;
                    case 3:
                        functions.browseProducts();
                        break;
                    case 4:
                        functions.addProductToCart(scanner);
                        break;
                    case 5:
                        functions.removeProductFromCart(scanner);
                        break;
                    case 6:
                        functions.viewCart();
                        break;
                    case 7:
                        functions.placeOrder(scanner);
                        break;
                    case 8:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the invalid input from the scanner
            }
        }
        scanner.close();
    }
}
