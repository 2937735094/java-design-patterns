package proxy.jdkdynamic.service.impl;

import proxy.jdkdynamic.service.PersonBean;

public class PersonBeanImpl implements PersonBean {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
