package org.xavier.designpatterns.CommandPattern.RefineStrategyPattern.CommandComponent;

import org.xavier.designpatterns.StrategyPattern.DuckCase.IFlyStrategy;

public class FlyCommand implements ICommand {

    private static final Double DEFAULT_HEIGHT = 10.32;

    IFlyStrategy receiver;
    double height;

    /**
     * Dependency injection ,
     * inject needed dependencies when instantiating.
     * @param receiver Receiver
     * @param height param ...
     */
    public FlyCommand(IFlyStrategy receiver, double height) {
        this.height = height;
        this.receiver = receiver;
    }

    public FlyCommand(IFlyStrategy receiver) {
        this.height = DEFAULT_HEIGHT;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.fly(height);
    }

    @Override
    public void rollBack() {
        System.out.println("rollback...");
    }
}
