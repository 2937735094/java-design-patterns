package proxy.cglib.service.impl;

public class Person {

    public String addName() { return "正在添加名称"; }

    public void getName() {
        System.out.println("foobar");
    }

    private void setName() {
        System.out.println("正在设置名称!");
    }

    public final void updateName() {
        System.out.println("正在修改名称");
    }
}
