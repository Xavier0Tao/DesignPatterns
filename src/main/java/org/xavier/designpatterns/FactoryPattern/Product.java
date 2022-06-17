package org.xavier.designpatterns.FactoryPattern;

public abstract class Product {
    protected String desc;

    public Product() {
        System.out.println("Super class Product constructor...");
    }
}
