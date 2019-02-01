package factory.abstractfactory.store;


import factory.abstractfactory.pizza.Pizza;

/**
 * 工厂方法模式 (这里最终会获取到一个pizza产品)
 *
 * 让子类决定该创建的对象是什么
 *
 * 让每个店自己决定自己的pizza类型
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();

        return pizza;
    }

    /* 一个工厂方法的例子 */
    protected abstract Pizza createPizza(String type);

}
