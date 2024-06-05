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
            System.out.print("Choose an option: ");

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
                default:
                    System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }
}

