package iterator.other;

import iterator.menu.DinerMenu;
import iterator.menu.PancakeHouseMenu;

import java.util.Iterator;

public class Waitress {
    private DinerMenu dinerMenu;
    private PancakeHouseMenu pancakeHouseMenu;

    public Waitress(DinerMenu dinerMenu, PancakeHouseMenu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu() {
        printMenu(dinerMenu.createIterator());
        System.out.println();
        System.out.println();
        printMenu(pancakeHouseMenu.createIterator());
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}