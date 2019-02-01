package state.state;

import state.machine.GumballMachine;

public class SoldState implements State  {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("请等待,正在交付糖果...[物理上弹出硬币]");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你已经转动曲柄,无法退币。");
    }

    @Override
    public void turnCrank() {
        System.out.println("你转动了多余次曲柄，无法获得多余的糖果!");
    }

    @Override
    public void dispense() {
        // 首先调用releaseBall让数量减1   其次判断数量修改状态
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            System.out.println("糖果售完...");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
    }
}
