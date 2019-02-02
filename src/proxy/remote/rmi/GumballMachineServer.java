package proxy.remote.rmi;

import proxy.machine.GumballMachineRemote;
import proxy.machine.GumballMachineRemoteImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * 作为服务端
 */
public class GumballMachineServer {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(2333);
            GumballMachineRemote gumballMachine = new GumballMachineRemoteImpl(10, "localhost");
            registry.rebind("gumballMachine", gumballMachine);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
