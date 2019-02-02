package proxy.jdkdynamic.handler;

import proxy.jdkdynamic.service.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
    private PersonBean person;

    public NonOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("get")) {
                System.out.printf("代理类[NonOwnerInvocationHandler]对方法[%s]进行处理\n", method.getName());
                return method.invoke(person, args);
            } else if (method.getName().startsWith("set")) {
                System.out.println("代理类[NonOwnerInvocationHandler]: 不允许操作set属性");
                return null;
            }
        } catch (InvocationTargetException ignored) {
        }
        return null;
    }
}
