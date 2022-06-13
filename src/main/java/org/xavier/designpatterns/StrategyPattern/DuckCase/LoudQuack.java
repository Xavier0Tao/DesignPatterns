package org.xavier.designpatterns.StrategyPattern.DuckCase;

public class LoudQuack implements IQuackStrategy{
    @Override
    public void quack() {
        System.out.println("loud quack...");
    }
}
