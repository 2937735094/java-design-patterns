package bridge.remote;

import bridge.tv.TV;

public abstract class RemoteControl {
    protected TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public abstract void on();

    public abstract void off();

    public abstract void setChannel(int channel);

    public abstract void nextChannel();

    public abstract int getChannel();
}
