package org.xavier.designpatterns.ObserverPattern.WeatherCase;

import java.util.HashSet;

public interface IObservable {
    public HashSet<IObserver> collections = new HashSet<>();

    void add(IObserver observer);

    void remove(IObserver observer);

    void notifyObservers();
}
