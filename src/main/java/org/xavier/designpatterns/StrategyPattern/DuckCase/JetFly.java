package org.xavier.designpatterns.StrategyPattern.DuckCase;

public class JetFly implements IFlyStrategy{
    @Override
    public void fly() {
        System.out.println("Jet Fly...");
    }
}
