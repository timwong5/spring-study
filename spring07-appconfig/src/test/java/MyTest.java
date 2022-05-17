import com.timwang5.config.MyConfig;
import com.timwang5.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {


    @Test
    public void testConfig(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        User user = (User) context.getBean("getUser");

        System.out.println(user.getName());
    }
}
