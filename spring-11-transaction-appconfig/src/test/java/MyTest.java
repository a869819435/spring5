import com.yang.config.ApplicationConfig;
import com.yang.dao.UserMapper;
import com.yang.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

    @Test
    public void userTest(){
        AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        UserMapper userMapper = config.getBean(UserMapper.class);
        UserService userService = config.getBean(UserService.class);
//        List<User> userList = userMapper.queryUser();
//        userList.forEach(System.out::println);
//        User user = new User(4,"xiao","123456");
//        userMapper.addUser(user);
//        userMapper.deleteUser(4);
//        userList = userMapper.queryUser();
//        userList.forEach(System.out::println);
//        List<User> userList = userMapper.queryUser();
//        userList.forEach(System.out::println);
        userService.testPointCut();
    }
}
