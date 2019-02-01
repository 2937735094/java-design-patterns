package template.base;

public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("冲咖啡");
    }

    @Override
    void addCondiments() {
        System.out.println("加入糖和牛奶");
    }
}
