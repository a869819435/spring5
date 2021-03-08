import com.yang.dao.UserMapper;
import com.yang.dao.UserMapperImpl;
import com.yang.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void userTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
//        List<User> userList = userMapper.queryUser();
//        userList.forEach(System.out::println);
//        User user = new User(4,"xiao","123456");
//        userMapper.addUser(user);
//        userMapper.deleteUser(4);
//        userList = userMapper.queryUser();
//        userList.forEach(System.out::println);
        userMapper.testPointCut();
    }
}
