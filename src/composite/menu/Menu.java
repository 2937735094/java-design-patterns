package composite.menu;

import composite.base.MenuComponent;

import java.util.ArrayList;

public class Menu extends MenuComponent {
    // 维护的是子菜单与菜单项的集合
    private ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        this.menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        this.menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return this.menuComponents.get(i);
    }

    @Override
    public void print() {
        System.out.println("菜单名称: " + getName() + " - " + getDescription());
        System.out.println("-----------------------------");

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
