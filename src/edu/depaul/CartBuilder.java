package edu.depaul;

public class CartBuilder {
    private ShoppingCart cart;

    public CartBuilder() {
        cart = ShoppingCart.getInstance();
    }

    public CartBuilder addProduct(Product product) {
        cart.addProduct(product);
        return this;
    }

    public CartBuilder removeProduct(Product product) {
        cart.removeProduct(product);
        return this;
    }
    
    public ShoppingCart build() {
        return cart;
    }
}

