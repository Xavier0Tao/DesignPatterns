package org.xavier.designpatterns.StrategyPattern.DuckCase;

public class Demo {

    public static void main(String[] args) {
        Duck duck = new Duck(new LoudQuack(), new JetFly());

        duck.fly(10.55);
        duck.quack();

        Duck duck1 = new Duck(SilentQuack.getSilentQuack(), new JetFly());
        duck1.fly(8.45);
        duck1.quack();

        System.out.println("--------------------------------------------------");
        SilentQuack silentQuack1 = SilentQuack.getSilentQuack();
        SilentQuack silentQuack2 = SilentQuack.getSilentQuack();
        System.out.println(silentQuack1);
        System.out.println(silentQuack2);
    }
}
