package decorator;

import decorator.beverage.DarkRoast;
import decorator.beverage.HouseBlend;
import decorator.decorator.Milk;
import decorator.decorator.Mocha;
import decorator.decorator.Soy;
import decorator.parent.Beverage;

public class Test {
    public static void main(String[] args) {
        Beverage beverage = new Soy(new Mocha(new Milk(new DarkRoast())));
        System.out.println("花费: " + beverage.cost());
        System.out.println(beverage.getDescription());

        beverage = new Soy(new Mocha(new Milk(new Milk(new HouseBlend()))));
        System.out.println("花费: " + beverage.cost());
        System.out.println(beverage.getDescription());
    }
}
