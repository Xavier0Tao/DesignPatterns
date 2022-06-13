package org.xavier.designpatterns.DecoratorPattern.CoffeCase;

public class Decaf extends AbstractBeverage {
    private static final double DECAF_PRICE = 3.0;

    @Override
    public double cost() {
        return DECAF_PRICE;
    }

}
