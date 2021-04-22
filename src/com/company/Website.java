package com.company;

import java.util.ArrayList;

public abstract class Website {
    ArrayList<Page> pages = new ArrayList<>();

    public Website() {
        createWebsite();
        for (Page p : pages) {
            p.render();
        }
    }

    public abstract void createWebsite();
}
