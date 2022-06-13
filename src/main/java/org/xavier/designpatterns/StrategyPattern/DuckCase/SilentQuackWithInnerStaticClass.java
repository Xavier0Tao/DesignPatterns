package org.xavier.designpatterns.StrategyPattern.DuckCase;

public class SilentQuackWithInnerStaticClass implements IQuackStrategy {

    private static class SilentQuackHolder{
        private static final SilentQuackWithInnerStaticClass silentQuack = new SilentQuackWithInnerStaticClass();
    }

    public SilentQuackWithInnerStaticClass getSilentQuack() {
        return SilentQuackHolder.silentQuack;
    }

    @Override
    public void quack() {
        System.out.println("quack singleton with private static inner class...");
    }
}
