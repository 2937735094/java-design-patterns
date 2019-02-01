package factory.method.store.chicago;

import factory.method.pizza.Pizza;
import factory.method.store.PizzaStore;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        throw new RuntimeException("暂未开店!");
    }
}
