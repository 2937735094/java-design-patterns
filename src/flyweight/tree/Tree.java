package flyweight.tree;

// 这是常规操作下的类, 如果有很多对象的化就要new 很多次  TreeFlyweight是该类的蝇量版本
public class Tree {
    private int xCoord;
    private int yCoord;
    private int age;

    public Tree(int xCoord, int yCoord, int age) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.age = age;
    }

    public void display() {
        System.out.printf("Position is [xCoord: %s, yCoord: %s, age: %s\n", xCoord, yCoord, age);
    }
}
