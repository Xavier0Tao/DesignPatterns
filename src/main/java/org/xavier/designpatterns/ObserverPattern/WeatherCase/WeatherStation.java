package org.xavier.designpatterns.ObserverPattern.WeatherCase;

public class WeatherStation implements IObservable {

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
        for (IObserver observer :
                collections) {
            observer.update();
        }
    }
}
