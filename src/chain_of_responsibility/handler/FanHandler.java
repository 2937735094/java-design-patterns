package chain_of_responsibility.handler;

public class FanHandler extends Handler {
    public FanHandler() {
        this.type = "FanHandler";
    }

    @Override
    public void handleRequest(String type) {
        if (this.type.equals(type)) {
            System.out.println("FanHandler handleRequest");
        } else if (this.successor != null) {
            System.out.println("路过FanHandler");
            this.successor.handleRequest(type);
        }
    }
}
