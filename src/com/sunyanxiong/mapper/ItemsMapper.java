package com.sunyanxiong.mapper;

import com.sunyanxiong.po.ItemsCustom;

import java.util.List;

/**
 * Description: 商品信息查询接口
 * <p>
 * Created by daxiongit on 2016/5/12 0012.
 */
public interface ItemsMapper {

    //  查询全部商品信息
    List<ItemsCustom> queryAllItems() throws Exception;

}
