package com.qf.dao;

public interface SellerMapper {
    int deleteByPrimaryKey(Integer sellerid);

    int insert(Seller record);

    int insertSelective(Seller record);

    Seller selectByPrimaryKey(Integer sellerid);

    int updateByPrimaryKeySelective(Seller record);

    int updateByPrimaryKey(Seller record);
}