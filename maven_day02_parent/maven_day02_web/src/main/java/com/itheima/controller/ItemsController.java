package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: java类作用描述
 * @Author: wn
 * @CreateDate: 2018/11/8$ 11:47$
 * @Version: 1.0
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("/findById")
    public String findById(Model model){
        Items items = itemsService.findById(1);
        System.out.println(items);
        model.addAttribute("item",items);
        return "itemDetail";
    }
}


