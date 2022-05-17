package com.timwang5.config;


import com.timwang5.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;




@Configuration
//根据定义的扫描路径，把符合扫描规则的类装配到spring容器中
@ComponentScan("com.timwang5.pojo")
public class MyConfig {

    //注册一个bean，相当于bean标签 名字是bean id， return相当于bean class
    @Bean
    public User getUser(){
        return new User();
    }
}
