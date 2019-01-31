package observer.java;


import java.util.Observable;
import java.util.Observer;

public class ObserverJavaA implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("观测者A说收到如下信息: [" + o.getClass().getSimpleName() + "]" + arg.toString());
    }
}
