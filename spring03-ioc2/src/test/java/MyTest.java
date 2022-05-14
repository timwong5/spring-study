import com.timwang5.pojo.User;
import com.timwang5.pojo.UserTwo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
//        User user = new User();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserTwo user = (UserTwo) context.getBean("u2");

        user.show();
    }
}
