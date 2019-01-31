package observer.observable;

import observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/* 可观察 */
public abstract class Observable {
    // 防止重复订阅
    private List<Observer> observers = new ArrayList<>();
    private boolean change = false;

    public void addObserver(Observer observer) {
        this.observers.add(observer);
        System.out.println("订阅人数为: " + this.observers.size());
    }

    public void removeObserver(Observer observer) {
        if (this.observers.indexOf(observer) > -1) {
            this.observers.remove(observer);
            System.out.println("订阅人数为: " + this.observers.size());
        }
    }

    protected void notifyObservers() {
        notifyObservers(null);
    }

    protected void notifyObservers(String message) {
        if (this.change) {
            this.observers.forEach(observer -> observer.update(message));
        }
    }

    protected void setChange() {
        this.change = true;
    }
}
