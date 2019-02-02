package compound.mvc;

import compound.mvc.controller.BeatController;
import compound.mvc.model.BeatModel;
import compound.mvc.model.BeatModelInterface;

/**
 * mvc设计模式模式 -> model1
 * 这里的代码示例是model1,将其定义为教科书般的使用方法(指其中策略模式、观察者模式、组合模式的实现方式)
 *
 * 通常我们使用的mvc模式并不是model1,而是model2
 *
 * 代码复制于 https://blog.csdn.net/wwj_748/article/details/9747941
 * 但是我觉得他写的不好,如果可以简单,没有谁会希望看一大坨东西来理解内容
 * 这里最简单的理解方法是  看一下各个类之间的关系,没必要看具体代码实现  手动画张图 这样理解更快
 *
 * 我也不会讲..附上自己画的model1.png
 *
 */
public class Test {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        new BeatController(model);
    }
}
