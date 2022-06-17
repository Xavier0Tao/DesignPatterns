package org.xavier.designpatterns.FactoryPattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteFactory2 implements ProductFactory{

    @Override
    public  Product createProduct() {
        log.warn("some logic in factory2...");
        return new ConcreteProductB();
    }
}
