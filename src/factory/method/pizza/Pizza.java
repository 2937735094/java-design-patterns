package factory.method.pizza;

import java.util.ArrayList;

/**
 * 这里仅仅是个抽象类的继承处理
 */
public abstract class Pizza {
    protected String name;
    protected ArrayList<String> toppings = new ArrayList<>(); // 佐料

    public void prepare() {
        System.out.println("准备" + name);
        System.out.println("和面...");
        System.out.println("加酱料...");
        System.out.println("加佐料: ");
        toppings.forEach(System.out::println);
    }

    public void bake() {
        System.out.println("烤25分钟");
    }

    public void cut() {
        System.out.println("切块");
    }

    public void box() {
        System.out.println("装箱");
    }

    public String getName() {
        return name;
    }
}
