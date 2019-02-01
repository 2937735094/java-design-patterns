package composite;

import composite.base.MenuComponent;
import composite.entity.MenuItem;
import composite.menu.Menu;
import composite.other.Waitress;

/**
 * 代码可能写的很烂  主要在于表达思想。。。  具体看README.md中的描述
 */
public class Test {
    public static void main(String[] args) {
        MenuComponent dicos = new Menu("德克士", "早餐");
        MenuComponent mcDonald = new Menu("麦当劳", "快餐");
        MenuComponent burgerKing = new Menu("汉堡王", "汉堡");
        MenuComponent dq = new Menu("DQ", "冰淇淋");

        MenuComponent root = new Menu("root", "breakfast");
        root.add(dicos);
        root.add(mcDonald);
        root.add(burgerKing);
        root.add(dq);

        dq.add(new MenuItem("暴风雪-朗姆葡萄巴旦木", "大杯雪糕", true, 30.00D));
        burgerKing.add(new MenuItem("双层芝士汉堡", "汉堡", false, 35.00D));
        dicos.add(new MenuItem("可乐", "冷饮", true, 3.00D));

        Waitress waitress = new Waitress(root);
        waitress.printMenu();
    }
}

/*
一个输出的大致样子 (手动处理格式后的)

菜单名称: root - breakfast
-----------------------------

	菜单名称: 德克士 - 早餐
	-----------------------------
		菜单项: [名称: 可乐],[描述: 冷饮], [是否为素: true], [价格: 3.00]

	菜单名称: 麦当劳 - 快餐
	-----------------------------

	菜单名称: 汉堡王 - 汉堡
	-----------------------------
		菜单项: [名称: 双层芝士汉堡],[描述: 汉堡], [是否为素: false], [价格: 35.00]

	菜单名称: DQ - 冰淇淋
	-----------------------------
		菜单项: [名称: 暴风雪-朗姆葡萄巴旦木],[描述: 大杯雪糕], [是否为素: true], [价格: 30.00]
 */