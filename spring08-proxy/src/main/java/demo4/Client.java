package demo4;

import demo2.UserService;
import demo2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserService userService = new UserServiceImpl();
        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //代理一个接口 即真实对象 设置代理对象
        pih.setTarget(userService);

        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();

        proxy.add();



    }

}
