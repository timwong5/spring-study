package com.timwang5.config;


import com.timwang5.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;




@Configuration
//���ݶ����ɨ��·�����ѷ���ɨ��������װ�䵽spring������
@ComponentScan("com.timwang5.pojo")
public class MyConfig {

    //ע��һ��bean���൱��bean��ǩ ������bean id�� return�൱��bean class
    @Bean
    public User getUser(){
        return new User();
    }
}
