package demo1;

public class Client {

    public static void main(String[] args) {
        //����Ҫ�ⷿ��
        Host host = new Host();
        //�����н�﷿���ⷿ�ӣ����Ǵ���һ�����һЩ��������
        Proxy proxy = new Proxy(host);

        //�㲻����Է�����ֱ������н�
        proxy.rent();
    }
}
