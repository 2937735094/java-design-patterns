package factory.abstractfactory.pizza.nystyle;

import factory.abstractfactory.ingredient.PizzaIngredientFactory;
import factory.abstractfactory.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name = "NYStyleCheesePizza";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("准备:" + name);
        cheese = pizzaIngredientFactory.createCheese();
        dough = pizzaIngredientFactory.createDough();
        veggies = pizzaIngredientFactory.createVeggies();
    }
}
