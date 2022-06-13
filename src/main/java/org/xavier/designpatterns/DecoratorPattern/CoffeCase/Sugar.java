package org.xavier.designpatterns.DecoratorPattern.CoffeCase;

public class Sugar extends BeverageDecorator {

    private static final Double SUGAR_PRICE = 1.0;

    public Sugar(AbstractBeverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return this.beverage.cost() + SUGAR_PRICE;
    }
}
