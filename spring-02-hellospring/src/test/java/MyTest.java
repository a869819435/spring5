import com.yang.entity.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 所有的对象写在都在Spring中的管理了，要使用直接去里面取出来就可以了
        // getBean: 参数即为spring配置文件中bean的id
        Hello hello = (Hello) context.getBean("hello");
        hello.show();
    }
}
