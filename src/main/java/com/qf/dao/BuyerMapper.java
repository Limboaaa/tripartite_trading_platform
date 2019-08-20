package com.qf.dao;

public interface BuyerMapper {
    int deleteByPrimaryKey(Long buyerid);

    int insert(Buyer record);

    int insertSelective(Buyer record);

    Buyer selectByPrimaryKey(Long buyerid);

    int updateByPrimaryKeySelective(Buyer record);

    int updateByPrimaryKey(Buyer record);
}