package template.base;

public abstract class CaffeineBeverage {

    public final void preparePecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("烧开水");
    }

    void pourInCup() {
        System.out.println("倒入杯中");
    }
}
