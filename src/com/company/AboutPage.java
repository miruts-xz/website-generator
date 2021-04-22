package com.company;

public class AboutPage extends Page {
    @Override
    public String toString() {
        return "About Page";
    }

    @Override
    public void render() {
        System.out.println("Rendering AboutPage");
    }
}
