package cn.xmlanno;

import cn.anno.User;
import cn.anno.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Sheng on 2018/4/11.
 */
public class TestXmlAnno {
    @Test
    public void testBookService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext2.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.add();
    }

}
