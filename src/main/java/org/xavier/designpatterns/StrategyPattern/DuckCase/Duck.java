package org.xavier.designpatterns.StrategyPattern.DuckCase;

public class Duck implements IFlyStrategy, IQuackStrategy {
    IFlyStrategy iFlyStrategy;
    IQuackStrategy iQuackStrategy;

    /*public void setiFlyStrategy(IFlyStrategy iFlyStrategy) {
        this.iFlyStrategy = iFlyStrategy;
    }

    public void setiQuackStrategy(IQuackStrategy iQuackStrategy) {
        this.iQuackStrategy = iQuackStrategy;
    }*/

    /**
     * Better to use constructor injection in case of NullPointerException
     */
    public Duck(IQuackStrategy iQuackStrategy, IFlyStrategy iFlyStrategy) {
        this.iQuackStrategy = iQuackStrategy;
        this.iFlyStrategy = iFlyStrategy;
    }

    @Override
    public void fly() {
        iFlyStrategy.fly();
    }

    @Override
    public void quack() {
        iQuackStrategy.quack();
    }
}
