package iterator;

import iterator.menu.DinerMenu;
import iterator.menu.PancakeHouseMenu;
import iterator.other.Waitress;

public class Test {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(new DinerMenu(), new PancakeHouseMenu());
        waitress.printMenu();

    }
}
