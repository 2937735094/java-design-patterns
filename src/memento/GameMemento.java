package memento;

public class GameMemento implements Cloneable {
    private int chapter;
    private int roleLevel;
    private String time;

    private GameMemento(int chapter, int roleLevel, String time) {
        this.chapter = chapter;
        this.roleLevel = roleLevel;
        this.time = time;
    }

    public static GameMemento savedGameState(int chapter, int roleLevel, String time) {
        return new GameMemento(chapter, roleLevel, time);
    }

    @Override
    public String toString() {
        return "GameMemento{" +
                "chapter=" + chapter +
                ", roleLevel=" + roleLevel +
                ", time='" + time + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public int getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(int roleLevel) {
        this.roleLevel = roleLevel;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}