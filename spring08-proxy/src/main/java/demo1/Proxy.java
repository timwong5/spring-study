package demo1;

public class Proxy implements Rent{


    private Host host;
    public void rent() {
        seeHouse();
        fare();
        contract();
        host.rent();
    }

    public Proxy(){}

    public Proxy(Host host){
        this.host = host;
    }


    //����
    public void seeHouse() {
        System.out.println("�н���㿴��");
    }

    //���н��
    public void fare() {
        System.out.println("���н��");
    }

    //���н��
    public void contract() {
        System.out.println("ǩ���޺�ͬ");
    }
}
