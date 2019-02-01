package facade;

import facade.base.DvdPlayer;
import facade.base.Projector;
import facade.base.Screen;

/**
 * 举个例子:
 * 你身边的电脑,你只需要知道按一下开机键就能开机就可以了.
 * 期间的系统/设备检索、如何运行系统你就可以完全不需要关注(将这一部分使用外观模式包装起来)
 */
public class Test {
    public static void main(String[] args) {
        // 这里仅仅是随手写的  理解含义 不要记代码
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new DvdPlayer(), new Projector(), new Screen());
        homeTheaterFacade.watchDvd();
        homeTheaterFacade.endDvd();
    }
}
