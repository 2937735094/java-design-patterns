package memento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MasterGameObject {
    private GameMemento gameState;

    // 查看
    public String getCurrentState() {
        return "最近的存档信息: " + gameState.toString();
    }

    public GameMemento gotoLatestStore() {
        if (gameState == null) {
            gameState = GameMemento.savedGameState(1, 0, LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        }
        // 存档不能出现安全泄露的问题
        try {
            return (GameMemento) gameState.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void restoreState(GameMemento gameState) {
        GameMemento temp = null;
        try {
            temp = (GameMemento) gameState.clone();
        } catch (CloneNotSupportedException ignored) {
        }
        if (temp != null) {
            this.gameState = temp;
            System.out.println("存档点已保存!");
        }
    }
}