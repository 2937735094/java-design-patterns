package decorator.decorator;

import decorator.parent.Beverage;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Mocha(2)";
    }

    @Override
    public int cost() {
        return 2 + beverage.cost();
    }
}
