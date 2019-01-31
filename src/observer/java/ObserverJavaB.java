package observer.java;

import java.util.Observable;
import java.util.Observer;

public class ObserverJavaB implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("观测者B说收到如下信息: [" + o.getClass().getSimpleName() + "]" + arg.toString());
    }
}
