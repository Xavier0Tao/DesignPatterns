package org.xavier.designpatterns.DecoratorPattern.CoffeCase;

public class Milk extends BeverageDecorator {
    private static final Double MILK_PRICE = 2.0;

    public Milk(AbstractBeverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return this.beverage.cost() + MILK_PRICE;
    }

}
