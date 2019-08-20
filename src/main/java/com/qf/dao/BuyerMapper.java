package com.qf.dao;

import com.qf.pojo.Buyer;

public interface BuyerMapper {
    int deleteByPrimaryKey(Long buyerid);

    int insert(Buyer record);

    int insertSelective(Buyer record);

    Buyer selectByPrimaryKey(Long buyerid);

    int updateByPrimaryKeySelective(Buyer record);

    int updateByPrimaryKey(Buyer record);
}