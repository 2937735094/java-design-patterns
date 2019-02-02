package proxy.remote.rmi;

import proxy.machine.GumballMachineRemote;
import proxy.monitor.GumballMonitor;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * 作为客户端
 */
public class GumballMonitorClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("192.168.1.6", 2333);
            GumballMachineRemote machine = (GumballMachineRemote) registry.lookup("gumballMachine");

            GumballMonitor gumballMonitor = new GumballMonitor(machine);
            gumballMonitor.report();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
