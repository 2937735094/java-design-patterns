package decorator.parent;

/**
 * 饮料
 */
public abstract class Beverage {
    private String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract int cost();

    protected void setDescription(String description) {
        this.description = description;
    }
}
