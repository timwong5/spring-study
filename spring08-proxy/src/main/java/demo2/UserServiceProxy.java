package demo2;

public class UserServiceProxy implements UserService{

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }



    //��־����
    private void log(String msg) {
        System.out.println("ʹ����" + msg + "����");
    }


    public void add() {
        log("add");
        userService.add();;

    }

    public void delete() {

        log("delete");
        userService.delete();

    }

    public void update() {

        log("update");
        userService.update();

    }

    public void query() {

        log("query");
        userService.query();

    }
}
