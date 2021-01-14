import com.yang.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        User user2 = (User) context.getBean("user");
        // 这里输出true表明地址相同，只实例化了一个User对象
        System.out.println(user == user2);
        user.show();
    }
}
