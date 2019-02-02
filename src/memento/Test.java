package memento;

public class Test {
    public static void main(String[] args) {
        Client client = new Client();
        // 打开客户端 -> 开始玩游戏 -> 被杀 -> 读档 -> 升级 -> 存档
        client.start();
        client.playGame();
        client.killed();
        client.gotoLatestStore();
        client.upgrade();
        client.restore();
        client.killed();
        client.getLatestStoreInfo();
        client.gotoLatestStore();
    }
}
