package org.xavier.designpatterns.ObserverPattern.WeatherCase;

import java.util.HashSet;

public class AnotherPublisher implements IObservable {
    private HashSet<IObserver> collections = new HashSet<>();

    @Override
    public void add(IObserver observer) {
        collections.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        collections.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver ob : collections) {
            System.out.println(ob);
        }

    }

}
