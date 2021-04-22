package com.company;

public class SearchPage extends Page {
    @Override
    public String toString() {
        return "Search Page";
    }

    @Override
    public void render() {
        System.out.println("Rendering SearchPage");
    }
}
