package proxy.machine;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachineRemoteImpl extends UnicastRemoteObject implements GumballMachineRemote {
    private String state;
    private int count;
    private String location;

    public GumballMachineRemoteImpl(int count, String location) throws RemoteException {
        this.count = count;
        this.location = location;
        this.state = "soldOut";
    }

    @Override
    public int getCount() throws RemoteException {
        return this.count;
    }

    @Override
    public String getLocation() throws RemoteException {
        return this.location;
    }

    @Override
    public String getState() throws RemoteException {
        return this.state;
    }
}
