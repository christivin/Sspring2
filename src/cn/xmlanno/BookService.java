package cn.xmlanno;

import org.aspectj.weaver.ast.Or;

import javax.annotation.Resource;

/**
 * Created by Sheng on 2018/4/11.
 */
public class BookService {

    //得到BookDao和OrdersDao对象
    @Resource(name = "bookDao")
    private BookDao bookDao;

    @Resource(name = "ordersDao")
    private OrdersDao ordersDao;
    public void add(){
        System.out.println("BookService.....");
        bookDao.book();
        ordersDao.buy();
    }
}
