package factory.method.pizza.nystyle;

import factory.method.pizza.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "NYStyleVeggiePizza";
        toppings.add("奶酪");
        toppings.add("水果");
    }

    @Override
    public void box() {
        System.out.print(" 经过精心准备的盒子 ");
        super.box();
    }
}
