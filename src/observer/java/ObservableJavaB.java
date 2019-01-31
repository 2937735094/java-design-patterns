package observer.java;

import java.util.Observable;

public class ObservableJavaB extends Observable {

    public void updateData() {
        setChanged();
        notifyObservers("可观测目标发生变化!");
    }
}
