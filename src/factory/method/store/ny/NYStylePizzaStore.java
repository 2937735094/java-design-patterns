package factory.method.store.ny;

import factory.method.pizza.Pizza;
import factory.method.pizza.nystyle.NYStyleCheesePizza;
import factory.method.pizza.nystyle.NYStyleVeggiePizza;
import factory.method.store.PizzaStore;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NYStyleCheesePizza();
        } else if ("veggie".equals(type)) {
            return new NYStyleVeggiePizza();
        } else if ("clam".equals(type)) {
            throw new RuntimeException("暂未供货!");
        } else if ("pepperoni".equals(type)) {
            throw new RuntimeException("暂未供货!");
        }
        throw new RuntimeException("无法识别的类型!");
    }


}
