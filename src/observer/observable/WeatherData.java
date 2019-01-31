package observer.observable;

public class WeatherData extends Observable {
    public void changeData(int a, int b) {
        setChange();
        // 消息以推的方式发送出去
        notifyObservers(String.format("数据变换为: [a: %x, b: %x]", a, b));
    }
}
