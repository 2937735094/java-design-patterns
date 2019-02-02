package proxy.remote.rmi.test;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("192.168.1.6", 2333);
            MyRemote service = (MyRemote) registry.lookup("test");
            System.out.println(service.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
