package bridge.tv;

public class Sony implements TV {
    private int channel;

    @Override
    public void on() {
        System.out.println("Sony on");
    }

    @Override
    public void off() {
        System.out.println("Sony off");
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
