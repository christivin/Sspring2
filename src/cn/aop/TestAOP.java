package cn.aop;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Sheng on 2018/4/11.
 */
public class TestAOP {

    @Test
    public void testUserService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext3.xml");
        Book book = (Book) context.getBean("book");
        book.add();
    }
}


