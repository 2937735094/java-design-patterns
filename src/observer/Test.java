package observer;

import observer.observable.WeatherData;
import observer.observer.Observer;
import observer.observer.ObserverA;
import observer.observer.ObserverB;

public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer observerA = new ObserverA(weatherData);
        Observer observerB = new ObserverB(weatherData);

        weatherData.removeObserver(observerB);
        weatherData.addObserver(observerB);

        weatherData.changeData(10, 20);
    }
}
