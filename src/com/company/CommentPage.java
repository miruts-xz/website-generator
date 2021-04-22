package com.company;

public class CommentPage extends Page {
    @Override
    public String toString() {
        return "Comment page";
    }

    @Override
    public void render() {
        System.out.println("Rendering CommentPage");
    }
}
