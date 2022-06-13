package org.xavier.designpatterns.DecoratorPattern.CoffeCase.InterfaceVersion;

public abstract class BeverageDecorator implements AbstractBeverage {
    AbstractBeverage beverage;

    public BeverageDecorator(AbstractBeverage beverage) {
        this.beverage = beverage;
    }
}
