package demo4;

import demo3.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    //������Ľӿ�
    private Object target;


    //set���� ��Ҫ ��ͨ�����ó������ɫ����������Ҫ���õĽӿڶ���
    public void setTarget(Object target) {
        this.target = target;
    }




    //���ɵõ�������
    public Object getProxy(){
        //this ָ����ǰ���������
        //����.class�õ����������
        //����.this	�ڲ�(�����������ڲ���)������ⲿ��Ķ���ʱʹ�ã�
        // �����ڲ�����ʹ��ʱ���ⲿ��������ⲿ����.this���ڲ����������this
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    //�������ʵ�������ؽ�� ���ص� �������ʵ�� �����ֻ��һ�������� ������Proxy��
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //method ʹ�� Java �ķ�����ƻ�õ�ָ������ָ�������Ķ���
        log(method.getName());



        //��̬����ı��ʣ�����ʹ�÷������
        //���� method����ִ��invoke ������rent ����args �������Ľ��

        Object result = method.invoke(target, args);


        return result;
    }

    public void log(String msg){
        System.out.println("ִ����"+msg+"����");
    }
}
