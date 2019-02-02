package bridge.remote;

import bridge.tv.TV;

public class ConcreteRemote extends RemoteControl {
    public ConcreteRemote(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        this.tv.on();
    }

    @Override
    public void off() {
        this.tv.off();
    }

    @Override
    public void setChannel(int channel) {
        this.tv.setChannel(channel);
    }

    @Override
    public void nextChannel() {
        this.tv.setChannel(this.tv.getChannel() + 1);
    }

    @Override
    public int getChannel() {
        return this.tv.getChannel();
    }
}
