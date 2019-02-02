package bridge;

import bridge.remote.ConcreteRemote;
import bridge.tv.Sony;

public class Test {
    public static void main(String[] args) {
        ConcreteRemote remote = new ConcreteRemote(new Sony());

        remote.on();
        remote.off();
        remote.setChannel(10);
        remote.nextChannel();
        System.out.println(remote.getChannel());
    }
}
