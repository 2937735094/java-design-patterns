package factory.abstractfactory.ingredient;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[0];
    }
}
