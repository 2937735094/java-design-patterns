package chain_of_responsibility;

import chain_of_responsibility.handler.*;

public class Test {
    public static void main(String[] args) {
        Handler chainOfHandlers = getChainOfHandlers();
        chainOfHandlers.handleRequest(Handler.TYPE_FAB);
    }

    private static Handler getChainOfHandlers(){
        Handler complaintHandler = new ComplaintHandler();
        Handler fanHandler = new FanHandler();
        Handler newLocHandler = new NewLocHandler();
        Handler spamHandler = new SpamHandler();

        complaintHandler.setNextSuccessor(fanHandler);
        fanHandler.setNextSuccessor(newLocHandler);
        newLocHandler.setNextSuccessor(spamHandler);
        return complaintHandler;
    }
}
