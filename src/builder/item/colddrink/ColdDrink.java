package builder.item.colddrink;

import builder.item.Item;
import builder.packing.Bottle;
import builder.packing.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}