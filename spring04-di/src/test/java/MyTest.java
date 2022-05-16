import com.timwang5.pojo.Students;
import com.timwang5.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Students student = (Students) context.getBean("student");

        //System.out.println(student.getName());

        System.out.println(student.toString());
    }


    @Test
    public void test1(){


        ApplicationContext context = new ClassPathXmlApplicationContext("userBean.xml");

        User user = (User) context.getBean("user");

        System.out.println(user.getName());

    }


    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userBean.xml");

        User user2 = (User) context.getBean("user2");

        System.out.println(user2.getName());
    }
}
