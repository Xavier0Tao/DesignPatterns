package org.xavier.designpatterns.StrategyPattern.DuckCase;

public class SlowFly implements IFlyStrategy{
    @Override
    public void fly() {
        System.out.println("slow fly...");
    }
}
