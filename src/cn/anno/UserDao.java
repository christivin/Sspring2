package cn.anno;

import org.springframework.stereotype.Component;

/**
 * Created by Sheng on 2018/4/11.
 */

@Component(value = "userDao")
public class UserDao {

    public void add(){
        System.out.println("Dao..........");
    }
}
