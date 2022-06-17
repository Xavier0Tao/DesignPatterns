package org.xavier.designpatterns.CommandPattern.RefineStrategyPattern.CommandComponent;


import org.xavier.designpatterns.StrategyPattern.DuckCase.Duck;

public class FlyCommand implements ICommand {

    private static final Double DEFAULT_HEIGHT = 10.32;

    Duck duck;
    double height;

    /**
     * Dependency injection ,
     * inject needed dependencies when instantiating.
     * @param duck Receiver
     * @param height param ...
     */
    public FlyCommand(Duck duck, double height) {
        this.height = height;
        this.duck = duck;
    }

    public FlyCommand(Duck duck) {
        this.height = DEFAULT_HEIGHT;
        this.duck = duck;
    }

    @Override
    public void execute() {
        duck.fly(height);
        duck.quack();
    }

    @Override
    public void rollBack() {
        System.out.println("rollback...");
    }
}
