package state.state;

import state.machine.GumballMachine;

public class NoQuarterState implements State  {
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你放入了一个硬币。");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("无法退币,未发现有插入的硬币。");
    }

    @Override
    public void turnCrank() {
        System.out.println("请先投入硬币");
    }

    @Override
    public void dispense() {
        System.out.println("你需要先支付!");
    }
}
