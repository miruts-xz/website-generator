package com.company;

public class ItemPage extends Page {
    @Override
    public String toString() {
        return "Items Page";
    }

    @Override
    public void render() {
        System.out.println("Rendering ItemsPage");
    }
}
