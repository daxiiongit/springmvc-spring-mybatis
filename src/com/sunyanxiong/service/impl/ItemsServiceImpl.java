package com.sunyanxiong.service.impl;

import com.sunyanxiong.mapper.ItemsMapperCustom;
import com.sunyanxiong.po.ItemsCustom;
import com.sunyanxiong.po.QueryItemsVo;
import com.sunyanxiong.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Description: 业务逻辑实现类
 * <p>
 * Created by daxiongit on 2016/5/13 0013.
 */
public class ItemsServiceImpl implements ItemsService {

    // 使用 spring 自动装配的方式
    @Autowired
    private ItemsMapperCustom itemsMapperCustom;


    @Override
    public List<ItemsCustom> findItemsDynamic(QueryItemsVo queryItemsVo) throws Exception {
        // 调用 持久层dao来查询数据库
        return itemsMapperCustom.findItemsDynamic(null);
    }
}
