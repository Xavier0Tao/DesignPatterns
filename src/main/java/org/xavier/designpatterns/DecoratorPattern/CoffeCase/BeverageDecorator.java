package org.xavier.designpatterns.DecoratorPattern.CoffeCase;

public abstract class BeverageDecorator extends AbstractBeverage  {
    AbstractBeverage beverage;

    public BeverageDecorator(AbstractBeverage beverage) {
        this.beverage = beverage;
    }
}
