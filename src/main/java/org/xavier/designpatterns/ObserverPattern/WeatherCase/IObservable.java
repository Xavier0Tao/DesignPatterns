package org.xavier.designpatterns.ObserverPattern.WeatherCase;

import java.util.HashSet;

public interface IObservable {

    void add(IObserver observer);

    void remove(IObserver observer);

    void notifyObservers();
}
