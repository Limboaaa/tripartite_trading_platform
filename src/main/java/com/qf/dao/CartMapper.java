package com.qf.dao;

import com.qf.pojo.CartInfo;

import java.util.List;

public interface CartMapper {
    public CartInfo selectByid(Integer userid, Integer goodId);

    public CartInfo insert(CartInfo cartInfo);

    public int update(CartInfo cartInfo);

    //通过userId查找购物车
    List<CartInfo> selectCartByUserId(Integer userId);

}
