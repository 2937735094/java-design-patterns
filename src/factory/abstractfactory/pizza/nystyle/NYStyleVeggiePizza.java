package factory.abstractfactory.pizza.nystyle;

import factory.abstractfactory.ingredient.PizzaIngredientFactory;
import factory.abstractfactory.pizza.Pizza;

public class NYStyleVeggiePizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public NYStyleVeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name = "NYStyleVeggiePizza";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("准备:" + name);
        dough = pizzaIngredientFactory.createDough();
        veggies = pizzaIngredientFactory.createVeggies();
    }

    @Override
    public void box() {
        System.out.print(" 经过精心准备的盒子 ");
        super.box();
    }
}
