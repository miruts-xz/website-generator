package com.company;

public class PostPage extends Page {
    @Override
    public String toString() {
        return "Post Page";
    }

    @Override
    public void render() {
        System.out.println("Rendering PostPage");
    }
}
