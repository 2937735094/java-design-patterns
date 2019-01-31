package decorator.decorator;

import decorator.parent.Beverage;

/**
 * 调味品装饰
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
