package iterator.menu;

import iterator.entity.MenuItem;
import iterator.iterator.DinerMenuIterator;

import java.util.Iterator;

public class DinerMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("D", "DDA", true, 2.10D);
        addItem("B", "BBB", true, 3.10D);
        addItem("C", "CCC", true, 4.10D);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        if ((numberOfItems + 1) != MAX_ITEMS) {
            menuItems[numberOfItems++] = new MenuItem(name, description, vegetarian, price);
        }
    }

//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
