package proxy.machine;

public class GumballMachine {
    private String state;
    private int count;
    private String location;

    public GumballMachine(int count, String location) {
        this.count = count;
        this.location = location;
        this.state = "soldOut";
    }

    /*                           GET/SET                              */

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    /*                           toString                              */
    @Override
    public String toString() {
        return "GumballMachine{state=" + getState() + ", count=" + getCount() + '}';
    }
}
