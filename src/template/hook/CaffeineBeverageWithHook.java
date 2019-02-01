package template.hook;

public abstract class CaffeineBeverageWithHook {

    public final void preparePecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("烧开水");
    }

    void pourInCup() {
        System.out.println("倒入杯中");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
