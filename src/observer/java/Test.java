package observer.java;

import java.util.Observer;

public class Test {
    public static void main(String[] args) {
        // 可观测目标
        ObservableJavaA observableJavaA = new ObservableJavaA();
        ObservableJavaB observableJavaB = new ObservableJavaB();

        // 观测者
        Observer observerJavaA = new ObserverJavaA();
        Observer observerJavaB = new ObserverJavaB();

        // 注册/订阅
        observableJavaA.addObserver(observerJavaA);
        observableJavaA.addObserver(observerJavaB);
        observableJavaB.addObserver(observerJavaA);

        // 开始修改被观测者数据
        observableJavaA.updateData();
        observableJavaB.updateData();

        // 预计观测者会收到通知
    }
}
