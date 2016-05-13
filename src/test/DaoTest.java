package test;

import com.sunyanxiong.mapper.ItemsMapper;
import com.sunyanxiong.mapper.ItemsMapperCustom;
import com.sunyanxiong.po.ItemsCustom;
import com.sunyanxiong.po.QueryItemsVo;
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

    // 测试使用动态的方式来查询商品信息
    @Test
    public void findItemsDynamic() throws Exception {
        ItemsMapperCustom itemsMapperCustom = (ItemsMapperCustom) applicationContext.getBean("itemsMapperCustom");

        // 构造测试查询对象
        /*QueryItemsVo queryItemsVo = new QueryItemsVo();
        ItemsCustom itemsCustom = new ItemsCustom();
        itemsCustom.setName("台式机");

        queryItemsVo.setItemsCustom(itemsCustom);

        List<ItemsCustom> list = itemsMapperCustom.findItemsDynamic(queryItemsVo);*/

        List<ItemsCustom> list2 = itemsMapperCustom.findItemsDynamic(null);
        System.out.println(list2);
    }

}
