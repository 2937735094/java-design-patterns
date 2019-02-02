package proxy.virtual;

public class Test {
    public static void main(String[] args) {
        Assistant assistant = new Assistant();
        assistant.addOrder("我找Boss面试");
        assistant.addOrder("我找Boss借钱");
        assistant.addOrder("我找Boss聊天");

        assistant.approve();

        assistant.addOrder("我找Boss吃饭");
        assistant.addOrder("我找Boss喝酒");
        assistant.approve();
    }
}
