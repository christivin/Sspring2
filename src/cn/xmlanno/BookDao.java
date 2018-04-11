package cn.xmlanno;

import org.springframework.stereotype.Component;

/**
 * Created by Sheng on 2018/4/11.
 */
@Component(value = "bookDao")
public class BookDao {

    public void add(){
        System.out.println("BookDao.....");
    }
}
