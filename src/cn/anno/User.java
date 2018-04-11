package cn.anno;

import org.springframework.stereotype.Component;
/**
 * Created by Sheng on 2018/4/11.
 */

@Component(value="user") // 相当于<bean id="user" class=""/>
public class User {

    public void add(){
        System.out.println("add.......");
    }
}
