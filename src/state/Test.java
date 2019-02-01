package state;

import state.machine.GumballMachine;

/**
 * 代码还是比较靠谱的可以看看
 *
 * 实现的功能
 * 一个糖果贩卖机功能  【操作流程：投币-扭动-出糖】  有一定几率会中奖 中奖后再免费送一颗
 */
public class Test {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(20);
        System.out.println(gumballMachine.toString());

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine.toString());

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine.toString());
    }
}
