package decorator.decorator;

import decorator.parent.Beverage;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Soy(1)";
    }

    @Override
    public int cost() {
        return 1 + beverage.cost();
    }
}
