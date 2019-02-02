package chain_of_responsibility.handler;

public class NewLocHandler extends Handler {
    public NewLocHandler() {
        this.type = "NewLocHandler";
    }

    @Override
    public void handleRequest(String type) {
        if (this.type.equals(type)) {
            System.out.println("NewLocHandler handleRequest");
        } else if (this.successor != null) {
            System.out.println("路过NewLocHandler");
            this.successor.handleRequest(type);
        }
    }
}
