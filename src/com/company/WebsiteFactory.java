package com.company;

public class WebsiteFactory {
    public Website getWebsite(WebsiteType type) {
        switch (type) {
            case BLOG:
                return new Blog();
            case SHOP:
                return new Shop();
            default:
                return null;
        }
    }
}
