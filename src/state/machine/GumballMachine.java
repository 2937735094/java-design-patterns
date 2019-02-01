package state.machine;

import state.state.*;

public class GumballMachine {
    private State soldState;
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State winnerState;

    private State state;
    private int count;

    public GumballMachine(int count) {
        this.soldOutState = new SoldOutState(this);
        this.soldState = new SoldState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.winnerState = new WinnerState(this);
        this.count = count;
        this.state = this.count > 0 ? this.noQuarterState : this.soldOutState;
    }

    public void insertQuarter() {
        this.state.insertQuarter();
    }

    public void ejectQuarter() {
        this.state.ejectQuarter();
    }

    public void turnCrank() {
        this.state.turnCrank();
        // 只有在转动曲柄的情况下才有可能发布糖果
        if (this.state.equals(this.soldState) || this.state.equals(this.winnerState)) {
            this.state.dispense();
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        // 只做发糖的工作
        System.out.println("糖果进入槽中,请自取...");
        setCount(getCount() > 0 ? getCount() - 1 : getCount());
    }


    /*                           GET/SET                              */
    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setCount(int count) {
        this.count = count;
    }


    /*                           toString                              */
    @Override
    public String toString() {
        return "GumballMachine{state=" + getState().toString() + ", count=" + getCount() + '}';
    }
}
