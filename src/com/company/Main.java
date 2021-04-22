package com.company;

public class Main {

    public static void main(String[] args) {
        WebsiteFactory factory = new WebsiteFactory();
        System.out.println("Generating Blog Website");
        Website blogWebsite = factory.getWebsite(WebsiteType.BLOG);
        System.out.println(blogWebsite.pages);

        System.out.println();
        System.out.println("Generating Shopping Website");
        Website shopWebsite = factory.getWebsite(WebsiteType.SHOP);
        System.out.println(shopWebsite.pages);
    }
}
