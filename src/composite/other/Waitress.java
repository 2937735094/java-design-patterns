package composite.other;

import composite.base.MenuComponent;

public class Waitress {
    private MenuComponent menus;

    public Waitress(MenuComponent menus) {
        this.menus = menus;
    }

    public void printMenu() {
        menus.print();
    }
}