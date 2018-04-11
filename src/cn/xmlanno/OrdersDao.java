package cn.xmlanno;

import org.springframework.stereotype.Component;

/**
 * Created by Sheng on 2018/4/11.
 */
@Component(value = "ordersDao")
public class OrdersDao {

    public void buy(){
        System.out.println("OrdersDao..........");

    }
}
