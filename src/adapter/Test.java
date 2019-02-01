package adapter;

import adapter.base.Duck;
import adapter.base.MallardDuck;
import adapter.base.Turkey;
import adapter.base.WildTurkey;

/**
 * 适配器也分 对象适配器和类适配器
 * 以下代码实现的是对象适配器
 * 类适配器这里不在编写 可参考 https://blog.csdn.net/qq_36982160/article/details/79965027 自己看
 * 两者说明见README.md
 *
 * 2孔、3孔、typeC等不同的插头通过适配器能够插入3孔的插座内
 */
public class Test {
    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        Turkey turkey = new WildTurkey();

        Duck duck2 = new TurkeyAdapter(turkey);

        duck1.quack();
        turkey.gobble();
        // 通过适配器可以统一调用
        duck2.quack();
    }
}
