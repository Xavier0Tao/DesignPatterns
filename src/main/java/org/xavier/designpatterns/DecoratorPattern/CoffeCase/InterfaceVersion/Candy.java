package org.xavier.designpatterns.DecoratorPattern.CoffeCase.InterfaceVersion;

public class Candy extends BeverageDecorator {
    private static final double CANDY_PRICE = 2.0;

    public Candy(AbstractBeverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return this.beverage.cost() + CANDY_PRICE;
    }
}
