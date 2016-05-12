package test;

import com.sunyanxiong.mapper.ItemsMapper;
import com.sunyanxiong.po.ItemsCustom;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Description: 测试数据库
 * <p>
 * Created by daxiongit on 2016/5/12 0012.
 */
public class DaoTest {

    private ApplicationContext applicationContext;

    @Before
    public void before(){
        applicationContext = new ClassPathXmlApplicationContext("config/spring/applicationContext-dao.xml");
    }

    // 测试查询全部商品信息
    @Test
    public void testQueryAllItems() throws Exception {

        // 拿到由spring 管理的代理对象
        ItemsMapper itemsMapper = (ItemsMapper) applicationContext.getBean("itemsMapper");
       // 执行查询方法
        List<ItemsCustom> list = itemsMapper.queryAllItems();

        // 打印结果
        System.out.println(list);

    }

}
