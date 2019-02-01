package composite.entity;

import composite.base.MenuComponent;

public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.printf("菜单项: [名称: %s],[描述: %s], [是否为素: %b], [价格: %.2f]\n", getName(), getDescription(), isVegetarian(), getPrice());
    }
}
