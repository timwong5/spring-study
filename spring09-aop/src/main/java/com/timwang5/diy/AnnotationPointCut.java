package com.timwang5.diy;

//ʹ��ע��ʵ��AOP

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect //��ע�������һ������
public class AnnotationPointCut {
    //ע������ݾ���д�����
    @Before("execution(* com.timwang5.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("==========����ִ��ǰ============");
    }
    @After("execution(* com.timwang5.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("==========����ִ�к�============");
    }
    //�ڻ�����ǿ�У����ǿ��Ը���һ����������������Ҫ��ȡ��������ĵ�
    @Around("execution(* com.timwang5.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("==========����ǰ============");

        //ִ�з���
        Object proceed  =joinPoint.proceed();
        System.out.println("���ƺ�");

    }
}
