package memento;

// 想象成马里奥  死了会在最近的存档点复活
public class Client {
    private GameMemento gameState;
    private MasterGameObject masterGameObject;

    public Client(){
        masterGameObject = new MasterGameObject();
    }

    public void start(){
        System.out.println("开始游戏,创建存档中...");
        System.out.println("存档创建完毕.");
        System.out.println("尽情体验游戏乐趣吧....");
        gameState = masterGameObject.gotoLatestStore();
        info();
    }

    // 前往最新存档点
    public void gotoLatestStore(){
        System.out.println("加载中... 正在加上最近存档");
        gameState = masterGameObject.gotoLatestStore();
        info();
    }

    public void playGame() {
        System.out.println("游戏中...");

        gameState.setRoleLevel(gameState.getRoleLevel() + 1);
        System.out.println("你升级了！当前等级: " + gameState.getRoleLevel());
        info();
    }

    // 被击杀
    public void killed(){
        System.out.println("你死了!");
    }

    // 重新存储
    public void restore(){
        System.out.println("创建新的存档点...");
        masterGameObject.restoreState(gameState);
        info();
    }

    public void upgrade() {
        gameState.setRoleLevel(gameState.getRoleLevel() + 1);
        System.out.println("你升级了！当前等级: " + gameState.getRoleLevel());
        info();
    }

    public void getLatestStoreInfo() {
        System.out.println(masterGameObject.getCurrentState());
    }

    private void info() {
        System.out.println(gameState.toString());
    }

}