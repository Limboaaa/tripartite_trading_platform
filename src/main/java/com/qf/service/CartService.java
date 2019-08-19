package com.qf.service;

import com.qf.pojo.CartInfo;

public interface CartService {
    public CartInfo selectByid(Integer userId, Integer goodId, Integer count);
}
