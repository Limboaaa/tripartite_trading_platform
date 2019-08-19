package com.qf.controller;


import com.qf.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    CartService cartService;
    //添加商品到购物车
    @RequestMapping("add")
    public boolean add(Integer userid,Integer goodId,Integer count){
        return false;
    }

}
