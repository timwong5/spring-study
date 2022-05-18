package demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ��̬�����ʵ��
 */
public class ProxyInvocationHandler implements InvocationHandler {
    //������Ľӿ�
    private Rent rent;

    //set���� ��Ҫ ��ͨ�����ó������ɫ����������Ҫ���õĽӿڶ���
    public void setRent(Rent rent) {
        this.rent = rent;
    }


    //���ɵõ�������
    public Object getProxy(){
        //this	ָ����ǰ���������
        //����.this	�ڲ�(�����������ڲ���)������ⲿ��Ķ���ʱʹ�ã�
        // �����ڲ�����ʹ��ʱ���ⲿ��������ⲿ����.this���ڲ����������this
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                rent.getClass().getInterfaces(),
                ProxyInvocationHandler.this);
    }

    //�������ʵ�������ؽ�� ���ص� �������ʵ�� �����ֻ��һ�������� ������Proxy��
    //�ڵ���Proxy��֮ǰʵ�ִ������ʵ�����ؽ�� ���Ի���������µ�seeHouse��Щ
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //��̬����ı��ʣ�����ʹ�÷������
        //���� method����ִ��invoke ������rent ����args �������Ľ��

        seeHouse();

        fare();

        Object result = method.invoke(rent, args);


        return result;
    }


    public void seeHouse() {
        System.out.println("�н��������");
    }

    public void fare() {
        System.out.println("���н��");
    }
}
