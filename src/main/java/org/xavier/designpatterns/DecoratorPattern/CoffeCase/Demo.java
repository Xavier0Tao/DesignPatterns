package org.xavier.designpatterns.DecoratorPattern.CoffeCase;

public class Demo {
    public static void main(String[] args) {
        Decaf decaf = new Decaf();
        AbstractBeverage beverageWithMilk = new Milk(decaf);
        BeverageDecorator decoratedWithMilk = new Milk(decaf);

        System.out.println(decoratedWithMilk.cost());

        BeverageDecorator decoratedWithMilkSugar = new Sugar(decoratedWithMilk);
        System.out.println(decoratedWithMilkSugar.cost());

        BeverageDecorator decoratedWithDoubleMilkSugar = new Milk(decoratedWithMilkSugar);
        System.out.println(decoratedWithDoubleMilkSugar.cost());

        AbstractBeverage decaf1 = new Decaf();
        for (int i = 0; i < 3; i++) {
            decaf1 = new Milk(decaf1);
        }
        System.out.println(decaf1.cost());

    }
}
