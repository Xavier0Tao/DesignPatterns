package org.xavier.designpatterns.FactoryPattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteProductA extends Product {
    public ConcreteProductA() {
        super();
        log.warn("this is Product A instantiated...");
        System.out.println("desc A: this is Product A instantiated...");

        this.desc = "this is Product A instantiated...";
    }
}
