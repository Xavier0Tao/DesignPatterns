package org.xavier.designpatterns.FactoryPattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteProductB extends Product {
    public ConcreteProductB() {
        super();
        log.warn("this is Product B instantiated...");
        System.out.println("desc B: this is Product B instantiated...");

        this.desc = "this is Product B instantiated...";
    }
}
