package com.timwang5.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class log implements MethodBeforeAdvice {

    //method: Ҫִ�е�Ŀ�����ķ���
    //objects�����
    //target��Ŀ�����
    @Override
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "��" + method.getName() + "��ִ����");
    }
}
