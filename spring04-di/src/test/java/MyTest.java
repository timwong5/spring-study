import com.timwang5.pojo.Students;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Students student = (Students) context.getBean("student");

        //System.out.println(student.getName());

        System.out.println(student.toString());
    }
}
