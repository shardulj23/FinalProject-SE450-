package edu.depaul;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    @Test
    public void testAddProduct() {
        ShoppingCart cart = ShoppingCart.getInstance();
        Product product = ProductFactory.createProduct("electronics", "Laptop", 1000.0);
        cart.addProduct(product);
        assertTrue(cart.getProducts().contains(product));
    }

    @Test
    public void testRemoveProduct() {
        ShoppingCart cart = ShoppingCart.getInstance();
        Product product = ProductFactory.createProduct("electronics", "Laptop", 1000.0);
        cart.addProduct(product);
        cart.removeProduct(product);
        assertFalse(cart.getProducts().contains(product));
    }

    @Test
    public void testGetProducts() {
        ShoppingCart cart = ShoppingCart.getInstance();
        Product product1 = ProductFactory.createProduct("electronics", "Laptop", 1000.0);
        Product product2 = ProductFactory.createProduct("clothing", "T-Shirt", 20.0);
        cart.addProduct(product1);
        cart.addProduct(product2);
        assertEquals(2, cart.getProducts().size());
    }
}

