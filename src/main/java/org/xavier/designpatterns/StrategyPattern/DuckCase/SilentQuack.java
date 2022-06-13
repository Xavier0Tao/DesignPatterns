package org.xavier.designpatterns.StrategyPattern.DuckCase;

public class SilentQuack implements IQuackStrategy {
    /**
     * Singleton Pattern Cuz it's dependency injection
     * 懒汉式
     */
    private static volatile SilentQuack silentQuack;

    /**
     * Private constructor don't let others to
     */
    private SilentQuack(){
        if (silentQuack != null) {
            /**
             * In case of Reflection
             */
            throw new RuntimeException();
        }
    }

    public static SilentQuack getSilentQuack() {
        if (silentQuack == null) {
            synchronized (SilentQuack.class) {
                if (silentQuack == null) {
                    silentQuack = new SilentQuack();
                }
            }
        }
        return silentQuack;
    }

    @Override
    public void quack() {
        System.out.println("silent quack");
    }

}
