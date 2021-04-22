package com.company;

public class ContactPage extends Page {
    @Override
    public String toString() {
        return "Contact Page";
    }

    @Override
    public void render() {
        System.out.println("Rendering ContactPage");
    }
}
