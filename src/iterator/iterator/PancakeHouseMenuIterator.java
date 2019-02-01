package iterator.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator {
    private ArrayList menuItems;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size() && menuItems.get(position) != null;
    }

    @Override
    public Object next() {
        return menuItems.get(position++);
    }
}
