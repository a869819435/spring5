package com.yang.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*表明是组件,等价于<bean id="user" class="com.yang.entity.User"/>*/

@Component
public class User {

    private String name;

    public String getName() {
        return name;
    }

    /*相当于<property name="name" value="ywq"/>*/
    @Value("ywq")
    public void setName(String name) {
        this.name = name;
    }
}
