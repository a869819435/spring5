import com.yang.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void userServiceTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 动态代理就是一个代理它可以通知不同的真实的对象的实现类需要实现的功能同时，还能完成自己需要完成事
        // 而静态代理只能通知限定的真实对象的功能
        // 同理，接口类请求切面完成一些事，切面相当于一个代理，它通知切点的实现类(可以是不同的业务功能的实现类)需要实现的功能同时按规定完成自己要做的事，比如打印出执行日志
        UserService userService = context.getBean("userService", UserService.class);
        userService.create();
    }
}
