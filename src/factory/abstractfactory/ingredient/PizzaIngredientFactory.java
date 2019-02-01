package factory.abstractfactory.ingredient;

/**
 * 这里是抽象工厂 提供所有的原料
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Cheese createCheese();
    Veggie[] createVeggies();
}