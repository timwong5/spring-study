package demo2;

public class Client {

    public static void main(String[] args) {


        //用代理调用方法
        UserServiceImpl userService = new UserServiceImpl();


        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);

        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.query();

    }
}
