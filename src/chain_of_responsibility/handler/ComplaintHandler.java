package chain_of_responsibility.handler;

public class ComplaintHandler extends Handler  {
    public ComplaintHandler() {
        this.type = "ComplaintHandler";
    }

    @Override
    public void handleRequest(String type) {
        if (this.type.equals(type)) {
            System.out.println("ComplaintHandler handleRequest");
        } else if (this.successor != null) {
            System.out.println("路过ComplaintHandler");
            this.successor.handleRequest(type);
        }
    }
}
