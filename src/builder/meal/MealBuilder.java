package builder.meal;

import builder.item.burger.ChickenBurger;
import builder.item.burger.VegBurger;
import builder.item.colddrink.Coke;
import builder.item.colddrink.Pepsi;

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}