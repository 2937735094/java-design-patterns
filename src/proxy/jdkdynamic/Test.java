package proxy.jdkdynamic;

import proxy.jdkdynamic.handler.NonOwnerInvocationHandler;
import proxy.jdkdynamic.service.PersonBean;
import proxy.jdkdynamic.service.impl.PersonBeanImpl;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        PersonBean foo = new PersonBeanImpl();
        foo.setName("foo");

        PersonBean nonOwnerProxy = getNonOwnerProxy(foo);
        System.out.println("Name is " + nonOwnerProxy.getName());
        nonOwnerProxy.setName("foo 2");
        System.out.println("Name is " + nonOwnerProxy.getName());
    }


    private static PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }
}
