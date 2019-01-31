package decorator.beverage;

import decorator.parent.Beverage;

/**
 * 深培咖啡
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        setDescription("Dark Roast Coffee(15)");
    }

    @Override
    public int cost() {
        return 15;
    }
}
