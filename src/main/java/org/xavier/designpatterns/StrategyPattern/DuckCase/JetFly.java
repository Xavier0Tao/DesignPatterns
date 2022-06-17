package org.xavier.designpatterns.StrategyPattern.DuckCase;

public class JetFly implements IFlyStrategy{
    @Override
    public void fly(double height) {
        System.out.println("Jet Fly"+height+"meters height...");
    }
}
