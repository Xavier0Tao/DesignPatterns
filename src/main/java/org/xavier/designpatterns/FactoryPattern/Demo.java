package org.xavier.designpatterns.FactoryPattern;

import org.xavier.designpatterns.StrategyPattern.DuckCase.Duck;

public class Demo {
    public static void main(String[] args) {
/*        ProductFactory factory = new ConcreteFactory2();
        Product product = factory.createProduct();*/

        ProductFactory factory = new ConcreteFactory1();
        Product product1 = factory.createProduct();

        ProductFactory factory2 = new ConcreteFactory2();
        Product product = factory2.createProduct();
        
    }

}
