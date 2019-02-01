package factory.abstractfactory.store.ny;

import factory.abstractfactory.ingredient.NYPizzaIngredientFactory;
import factory.abstractfactory.pizza.Pizza;
import factory.abstractfactory.pizza.nystyle.NYStyleCheesePizza;
import factory.abstractfactory.pizza.nystyle.NYStyleVeggiePizza;
import factory.abstractfactory.store.PizzaStore;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        NYPizzaIngredientFactory nyPizzaIngredientFactory = new NYPizzaIngredientFactory();
        if ("cheese".equals(type)) {
            return new NYStyleCheesePizza(nyPizzaIngredientFactory);
        } else if ("veggie".equals(type)) {
            return new NYStyleVeggiePizza(nyPizzaIngredientFactory);
        } else if ("clam".equals(type)) {
            throw new RuntimeException("暂未供货!");
        } else if ("pepperoni".equals(type)) {
            throw new RuntimeException("暂未供货!");
        }
        throw new RuntimeException("无法识别的类型!");
    }


}
