package com.company;

// Shop represents an E-Commerce website
public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new ItemPage());
        pages.add(new CartPage());
        pages.add(new SearchPage());
    }
}
