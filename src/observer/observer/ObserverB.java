package observer.observer;

import observer.observable.Observable;

public class ObserverB implements Observer {
    private Observable observable;

    public ObserverB(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(String message) {
        System.out.println("B收到消息: " + message);
    }
}
