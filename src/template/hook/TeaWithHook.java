package template.hook;

public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("泡茶");
    }

    @Override
    void addCondiments() {
        System.out.println("加入柠檬");
    }
}
