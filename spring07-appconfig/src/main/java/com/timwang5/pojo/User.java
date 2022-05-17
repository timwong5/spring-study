package com.timwang5.pojo;

import org.springframework.beans.factory.annotation.Value;


//这里这个注解的意思，就是说明这个类被Spring接管了,注解到了容器中
public class User {
    @Value("tim")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
