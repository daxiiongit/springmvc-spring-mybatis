package com.sunyanxiong.controller;

import com.sunyanxiong.po.ItemsCustom;
import com.sunyanxiong.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Description: 前端控制器
 * <p>
 * Created by daxiongit on 2016/5/13 0013.
 */

@Controller
public class ItemsConttroller {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/queryItems")
    public ModelAndView queryItems() throws Exception{

        // 前端控制器通过调用业务逻辑层查询数据
        List<ItemsCustom> itemsList = itemsService.findItemsDynamic(null);

        // 返回 ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemsList",itemsList);

        // 设置返回到的 view 的名字
        modelAndView.setViewName("items/itemsList");

        // 返回
        return modelAndView;

    }

}
