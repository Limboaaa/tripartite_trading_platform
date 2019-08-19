package com.qf.service;

import com.qf.pojo.CartInfo;

public interface CartService {
    //查询购物车の用户id  商品id 和数量
    public CartInfo selectByid(Integer userId, Integer goodId, Integer count);
}
