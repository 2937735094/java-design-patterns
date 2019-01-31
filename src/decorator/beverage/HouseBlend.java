package decorator.beverage;

import decorator.parent.Beverage;

/**
 * 混合咖啡
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        setDescription("House Blend Coffee(10)");
    }

    @Override
    public int cost() {
        return 10;
    }
}
