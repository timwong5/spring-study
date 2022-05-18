package demo3;

public class Client {

    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //利用代理
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //通过调用setRent处理我们要调用的接口对象
        pih.setRent(host);


        //得到proxy对象
        Rent proxy = (Rent) pih.getProxy();

        //执行操作
        proxy.rent();

    }
}
