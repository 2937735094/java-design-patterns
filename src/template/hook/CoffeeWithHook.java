package template.hook;

import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("冲咖啡");
    }

    @Override
    void addCondiments() {
        System.out.println("加入糖和牛奶");
    }

    @Override
    boolean customerWantsCondiments() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("咖啡是否要加入糖和牛奶？");
        return scanner.nextBoolean();
    }
}
