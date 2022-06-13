package org.xavier.designpatterns.DecoratorPattern.CoffeCase.InterfaceVersion;

public class Decaf implements AbstractBeverage {

    private static final double DECAF_PRICE = 3.0;

    @Override
    public double cost() {
        return DECAF_PRICE;
    }
}
