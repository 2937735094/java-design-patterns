package state.state;

import state.machine.GumballMachine;

import java.util.Random;

public class HasQuarterState implements State {
    private Random random = new Random();

    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你已经放如果硬币，不能重复投放！[物理弹出]");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("硬币退回成功！");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        // 这里就该发糖了 由于在GumballMachine中调用了dispense方法  故这里只需要修改一下状态  配置一下随即中奖即可
        System.out.println("你转动了...正在交付糖果");
        int winner = random.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("异常进入发放方法!");
    }
}
