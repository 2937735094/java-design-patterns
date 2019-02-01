package state.state;

import state.machine.GumballMachine;

public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你不能放入硬币,糖果已售完！");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("无法退币,未发现有插入的硬币。");
    }

    @Override
    public void turnCrank() {
        System.out.println("你转动了曲柄,但是糖果已经售空");
    }

    @Override
    public void dispense() {
        System.out.println("异常进入发放方法!");
    }
}
