package chain_of_responsibility.handler;

public class SpamHandler extends Handler {
    public SpamHandler() {
        this.type = "SpamHandler";
    }

    @Override
    public void handleRequest(String type) {
        if (this.type.equals(type)) {
            System.out.println("SpamHandler handleRequest");
        } else if (this.successor != null) {
            System.out.println("路过SpamHandler");
            this.successor.handleRequest(type);
        }
    }
}
