package factory.abstractfactory.store.chicago;

import factory.abstractfactory.pizza.Pizza;
import factory.abstractfactory.store.PizzaStore;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        throw new RuntimeException("暂未开店!");
    }
}
