package org.xavier.designpatterns.CommandPattern.RefineStrategyPattern.CommandComponent;

public interface ICommand {
    void execute();

    void rollBack();
}
