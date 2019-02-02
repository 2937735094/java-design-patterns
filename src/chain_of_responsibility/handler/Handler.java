package chain_of_responsibility.handler;

public abstract class Handler {
    public static String TYPE_COMPLAINT = "ComplaintHandler";
    public static String TYPE_FAB = "FanHandler";
    public static String TYPE_NEW_LOC = "NewLocHandler";
    public static String TYPE_SPAM = "SpamHandler";

    protected String type;
    // 共产主义接班人...XD.
    protected Handler successor;

    public void setNextSuccessor(Handler handler) {
        this.successor = handler;
    }

    public abstract void handleRequest(String type);
}
