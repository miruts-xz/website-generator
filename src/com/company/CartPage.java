package com.company;

public class CartPage extends Page {
    @Override
    public String toString() {
        return "Cart Page";
    }

    @Override
    public void render() {
        System.out.println("Rendering CartPage");
    }
}
