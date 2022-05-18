package demo4;

import demo2.UserService;
import demo2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //��ʵ��ɫ
        UserService userService = new UserServiceImpl();
        //�����ɫ
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //����һ���ӿ� ����ʵ���� ���ô������
        pih.setTarget(userService);

        //��̬���ɴ�����
        UserService proxy = (UserService) pih.getProxy();

        proxy.add();



    }

}
