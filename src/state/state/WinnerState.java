package state.state;

import state.machine.GumballMachine;

public class WinnerState implements State {
    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("请等待,正在交付糖果...");
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
        /*
        1.首先调用releaseBall让数量减1
        2.然后判断数量是否还有
        3.如果还有,就在调用releaseBall让数量减1  否则  修改为SoldOutState
        4.在第3步前半段情况下, 进行判断数量修改状态
         */
        System.out.println("你中奖了!你就获取2个糖果!");
        // 第一次发放
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            System.out.println("很抱歉,由于糖果刚好售完,无法继续发放!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            // 第二次发放
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {  // 如果写 == 0 就代码重复了。。。
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("糖果售完...");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
