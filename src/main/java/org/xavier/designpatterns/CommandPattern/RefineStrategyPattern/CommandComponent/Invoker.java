package org.xavier.designpatterns.CommandPattern.RefineStrategyPattern.CommandComponent;

public class Invoker {
    ICommand flyCommand;

    public Invoker(ICommand flyCommand) {
        this.flyCommand = flyCommand;
    }

    public void flyRun() {
        flyCommand.execute();
    }

}
