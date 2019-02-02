package proxy.remote.rmi.test;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    private static final long serialVersionUID = 3434060152387200042L;

    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "服务端; 你好!";
    }

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(2333);
            registry.bind("test", new MyRemoteImpl());
            System.out.println("服务已启动完成!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
