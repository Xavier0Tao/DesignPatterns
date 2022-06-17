package org.xavier.designpatterns.CommandPattern.RefineStrategyPattern.CommandComponent;


import org.xavier.designpatterns.StrategyPattern.DuckCase.*;

public class Client {

    public static void main(String[] args) {
        double height = 20.3;
        ICommand flyCommand = new FlyCommand(new Duck(new LoudQuack(), new JetFly()), height);

        ICommand flyCommand1 = new FlyCommand(new Duck(SilentQuack.getSilentQuack(), new SlowFly()));

        Invoker invoker1 = new Invoker(flyCommand1);

        invoker1.flyRun();
    }

    public void run(ICommand command) {
        command.execute();
        command.rollBack();
    }

}
