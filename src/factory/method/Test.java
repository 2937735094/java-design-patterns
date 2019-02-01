package factory.method;

import factory.method.pizza.Pizza;
import factory.method.store.PizzaStore;
import factory.method.store.chicago.ChicagoStylePizzaStore;
import factory.method.store.ny.NYStylePizzaStore;

public class Test {
    public static void main(String[] args) {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();

        Pizza cheese = nyStylePizzaStore.orderPizza("cheese");
        System.out.println("张三订购了" + cheese.getName() + "!");

        Pizza veggie = nyStylePizzaStore.orderPizza("veggie");
        System.out.println("李四订购了" + veggie.getName() + "!");

        // 暂未开店
        chicagoStylePizzaStore.orderPizza(null);
    }
}
