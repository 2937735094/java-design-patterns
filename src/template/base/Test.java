package template.base;

/**
 * 最简写法
 */
public class Test {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();

        tea.preparePecipe();
        coffee.preparePecipe();
    }
}
