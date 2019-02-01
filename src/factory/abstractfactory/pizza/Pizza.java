package factory.abstractfactory.pizza;

import factory.abstractfactory.ingredient.Cheese;
import factory.abstractfactory.ingredient.Dough;
import factory.abstractfactory.ingredient.Veggie;

import java.util.ArrayList;

/**
 * 这里仅仅是个抽象类的继承处理
 */
public abstract class Pizza {
    protected String name;
    protected ArrayList<String> toppings = new ArrayList<>(); // 佐料

    protected Cheese cheese;
    protected Dough dough;
    protected Veggie[] veggies;

    public abstract void prepare();

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
