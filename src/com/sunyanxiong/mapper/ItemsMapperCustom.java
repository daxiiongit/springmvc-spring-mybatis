package com.sunyanxiong.mapper;

import com.sunyanxiong.po.ItemsCustom;
import com.sunyanxiong.po.QueryItemsVo;

import java.util.List;

/**
 * Description: 查询商品映射接口扩展
 * <p>
 * Created by daxiongit on 2016/5/13 0013.
 */
public interface ItemsMapperCustom {

    List<ItemsCustom> findItemsDynamic (QueryItemsVo queryItemsVo) throws Exception;

}
