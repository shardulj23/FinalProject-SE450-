# FinalProject-SE450-

### Project Overview

This project is a console-based shopping system developed in Java. It demonstrates fundamental principles and design patterns, including the SOLID principles, Singleton, Factory, and Builder design patterns. The application includes functionalities such as user authentication, product catalog management, shopping cart operations, order processing, payment simulation, and logging.

### Features

- User Authentication: Register and login functionality for users.
- Product Catalog: A catalog of products, including electronics and clothing.
- Shopping Cart: Singleton implementation for managing products in a shopping cart.
- Order Processing: Place orders and link them to user accounts.
- Payment Processing: Simulate payment processing.
- Logging: Record important events and transactions.

### Implementation Details

Java Console Application: 
The project is implemented in Java as a console-based application.

Directory Structure:
```
src/
└── edu/
    └── depaul/
        ├── AuthenticationService.java
        ├── CartBuilder.java
        ├── Clothing.java
        ├── Electronics.java
        ├── Logger.java
        ├── Order.java
        ├── OrderService.java
        ├── PaymentService.java
        ├── Product.java
        ├── ProductFactory.java
        ├── ShoppingCart.java
        ├── MainClass.java
        ├── ShoppingAppUI.java
        ├── ShoppingAppFunctions.java
        └── User.java
        └── ShoppingCartTest.java
```

### Design Principles and Patterns

SOLID Principles

- Single Responsibility Principle: Each class has a single responsibility.
- Open/Closed Principle: Classes are open for extension but closed for modification.
- Liskov Substitution Principle: Subclasses can be used interchangeably with their base classes.
- Interface Segregation Principle: Interfaces are client-specific and not too "fat."
- Dependency Inversion Principle: High-level modules are not dependent on low-level modules. Dependencies are injected.
- Design Patterns

- Singleton: Ensures that only one instance of the shopping cart exists.
- Factory: Encapsulates the creation of different product types.
- Builder: Provides a fluent interface to build and manage the shopping cart.

### Running the Application

To run the application:

- Compile the Java files using a Java compiler. 
- Execute the MainClass, which serves as the main entry point of the application.

### Usage

- Register a new user
- Login with an existing user
- Browse products in the catalog
- Add products to the shopping cart
- Remove products from the shopping cart
- View the contents of the shopping cart
- Place an order
- Simulate payment processing

### Future Enhancements

- Transition to a graphical user interface (GUI) or web-based interface
- Integration with real payment gateways
- Persistent storage for user data and product catalog
- Implementing junit(maven issues)
