package cn.anno;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Sheng on 2018/4/11.
 */

@Service("userService")
public class UserService {

    //得到Dao对象
    //1定义dao类型属性
    //在dao属性上面使用注解完成对象注入
    @Autowired
    private UserDao userDao;

    //使用注解不需要建立set方法
    public void add(){
        System.out.println("Service..........");
        userDao.add();
    }
}
