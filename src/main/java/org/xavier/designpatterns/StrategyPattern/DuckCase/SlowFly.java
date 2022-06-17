package org.xavier.designpatterns.StrategyPattern.DuckCase;

public class SlowFly implements IFlyStrategy{
    @Override
    public void fly(double height) {
        System.out.println("slow fly"+height+"meters height...");
    }
}
