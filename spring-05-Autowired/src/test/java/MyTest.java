import com.yang.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = context.getBean("person", Person.class);
        Person person2 = context.getBean("person", Person.class);
        System.out.println(person.getDog() == person2.getDog());
        person.getDog().shout();
        person.getCat().shout();
        System.out.println("钟".length());
    }
}
