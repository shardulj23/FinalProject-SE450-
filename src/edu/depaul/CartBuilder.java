package edu.depaul;

public class CartBuilder {
    private ShoppingCart cart;

    public CartBuilder() {
        cart = ShoppingCart.getInstance();
    }
    
    public ShoppingCart build() {
        return cart;
    }
}

