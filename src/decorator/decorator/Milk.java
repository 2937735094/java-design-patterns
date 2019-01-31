package decorator.decorator;

import decorator.parent.Beverage;

public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Milk(1)";
    }

    @Override
    public int cost() {
        return 1 + beverage.cost();
    }
}
