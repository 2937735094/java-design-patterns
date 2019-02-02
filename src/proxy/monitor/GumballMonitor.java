package proxy.monitor;

import proxy.machine.GumballMachineRemote;

import java.rmi.RemoteException;

public class GumballMonitor {
    private GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        try {
            System.out.println("GumballMachine{state=" + gumballMachine.getState() + ", count=" + gumballMachine.getCount() + '}');
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
