package iterator.menu;

import iterator.entity.MenuItem;
import iterator.iterator.PancakeHouseMenuIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    private ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("A", "AAA", true, 2.10D);
        addItem("B", "BBB", true, 3.10D);
        addItem("C", "CCC", true, 4.10D);
    }

    @SuppressWarnings("unchecked")
    public void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.add(new MenuItem(name, description, vegetarian, price));
    }

//    public ArrayList getMenuItems() {
//        return menuItems;
//    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
