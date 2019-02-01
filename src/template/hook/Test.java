package template.hook;

/**
 * 使用hook的写法
 */
public class Test {
    public static void main(String[] args) {
        CaffeineBeverageWithHook coffeeWithHook = new CoffeeWithHook();
        CaffeineBeverageWithHook teaWithHook = new TeaWithHook();

        System.out.println("------------- 咖啡 ------------------");
        coffeeWithHook.preparePecipe();
        System.out.println("------------- 茶 ------------------");
        teaWithHook.preparePecipe();
    }
}
