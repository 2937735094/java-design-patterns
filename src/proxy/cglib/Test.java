package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import proxy.cglib.handle.CglibProxy;
import proxy.cglib.service.impl.Person;

public class Test {
    public static void main(String[] args) {
        Person engineerProxy = (Person) getProxy(new Person());
        engineerProxy.getName();
        engineerProxy.addName();
        // 没有经过代理类  直接执行了person中的方法
        engineerProxy.updateName();
    }

    private static Object getProxy(Object target) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new CglibProxy(target));
        return enhancer.create();
    }
}
