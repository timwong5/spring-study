package com.timwang5.pojo;

import org.springframework.beans.factory.annotation.Value;


//�������ע�����˼������˵������౻Spring�ӹ���,ע�⵽��������
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
