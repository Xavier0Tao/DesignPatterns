package org.xavier.designpatterns.ObserverPattern.WeatherCase;

public class Demo {
    public static void main(String[] args) {
        IObservable anoPub = new AnotherPublisher();
        IObservable weather = new WeatherStation();

        weather.add(new PhoneDisplay());

        anoPub.notifyObservers();
    }
}
