package factory.method.pizza.nystyle;

import factory.method.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NYStyleCheesePizza";
        toppings.add("培根");
        toppings.add("榴莲");
    }
}
