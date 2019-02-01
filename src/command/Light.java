package command;

public class Light {
    private boolean open = false;

    public void on() {
        open = true;
    }

    public void off() {
        open = false;
    }

    public String getState() {
        if (open) System.out.println("开着灯");
        else System.out.println("关着灯");
        return null;
    }
}
