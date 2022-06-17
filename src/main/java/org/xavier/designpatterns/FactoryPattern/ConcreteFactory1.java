package org.xavier.designpatterns.FactoryPattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteFactory1 implements ProductFactory {
    @Override
    public Product createProduct() {
        log.warn("logic1 before instantiate an object...");

        return new ConcreteProductA();
    }


}
