package demo3;

public class Client {

    public static void main(String[] args) {
        //��ʵ��ɫ
        Host host = new Host();

        //���ô���
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //ͨ������setRent��������Ҫ���õĽӿڶ���
        pih.setRent(host);


        //�õ�proxy����
        Rent proxy = (Rent) pih.getProxy();

        //ִ�в���
        proxy.rent();

    }
}
