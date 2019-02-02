package bridge.tv;

public class RCA implements TV {
    private int channel;

    @Override
    public void on() {
        System.out.println("RCA on");
    }

    @Override
    public void off() {
        System.out.println("RCA off");
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public int getChannel() {
        return channel;
    }
}
