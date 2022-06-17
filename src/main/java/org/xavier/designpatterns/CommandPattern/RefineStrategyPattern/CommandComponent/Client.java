package org.xavier.designpatterns.CommandPattern.RefineStrategyPattern.CommandComponent;


import org.xavier.designpatterns.StrategyPattern.DuckCase.*;

public class Client {

    public static void main(String[] args) {
        double height = 20.3;
        ICommand flyCommand = new FlyCommand(new Duck(new LoudQuack(), new JetFly()), height);

        Client demo = new Client();
//        demo.run(flyCommand);

        ICommand flyCommand1 = new FlyCommand(new Duck(SilentQuack.getSilentQuack(), new SlowFly()));
        demo.run(flyCommand1);
    }

    public void run(ICommand command) {
        command.execute();
        command.rollBack();
    }

}
