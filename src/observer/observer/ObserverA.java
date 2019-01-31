package observer.observer;

import observer.observable.Observable;

public class ObserverA implements Observer {
    private Observable observable;

    public ObserverA(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(String message) {
        System.out.println("A收到消息: " + message);
    }
}