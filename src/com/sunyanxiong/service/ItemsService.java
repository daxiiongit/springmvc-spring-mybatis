package com.sunyanxiong.service;

import com.sunyanxiong.po.ItemsCustom;
import com.sunyanxiong.po.QueryItemsVo;

import java.util.List;

/**
 * Description: 业务逻辑层
 * <p>
 * Created by daxiongit on 2016/5/13 0013.
 */
public interface ItemsService {

    // 查询上屏信息列表
    List<ItemsCustom> findItemsDynamic (QueryItemsVo queryItemsVo) throws Exception;
}
