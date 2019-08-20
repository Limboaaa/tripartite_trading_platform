package com.qf.dao;

import com.qf.pojo.Seller;

public interface SellerMapper {
    int deleteByPrimaryKey(Integer sellerid);

    int insert(Seller record);

    int insertSelective(Seller record);

    Seller selectByPrimaryKey(Integer sellerid);

    int updateByPrimaryKeySelective(Seller record);

    int updateByPrimaryKey(Seller record);
}