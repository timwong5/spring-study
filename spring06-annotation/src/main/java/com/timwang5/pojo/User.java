package com.timwang5.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//�ȼ��� <bean id="user" class="com.timwang5.pojo.User"/>
@Component
public class User {



//     �򵥵Ŀ�����ע��
//     �൱��<bean id="user" class="com.timwang5.pojo.User">
//        <property name = "name" value = "tim"/>
//    </bean>
    @Value("tim")
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
