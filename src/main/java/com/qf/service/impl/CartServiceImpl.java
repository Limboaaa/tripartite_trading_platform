package com.qf.service.impl;

import com.qf.dao.CartMapper;
import com.qf.pojo.CartInfo;
import com.qf.service.CartService;
import com.qf.vo.CartGoodsVO;
import com.qf.vo.CartVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartMapper cartMapper;

    public CartInfo selectByid(Integer userId, Integer goodId,Integer count) {
        CartInfo cartInfo=cartMapper.selectByid(userId,goodId);
        if (cartInfo==null){
            //说明这个商品不在购物车里,需要新增一个这个商品的记录
            CartInfo cartInfo1=new CartInfo();
            cartInfo1.setNum(count);
            cartInfo1.setChecked(1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            cartMapper.insert(cartInfo1);
        }else{
            //如果没查到,则增加一条数据
            count=cartInfo.getNum()+count;
            cartInfo.setNum(count);
            cartMapper.update(cartInfo);
        }
        return null;
    }

    private CartInfo getCartVOLimit(Integer userId){
        CartVO cartVO=new CartVO();
        List<CartInfo> cartInfos = cartMapper.selectCartByUserId(userId);
        ArrayList<CartGoodsVO> cartGoodsVOS = new ArrayList<CartGoodsVO>();
        //使用    BigDisimal防止丢精
        BigDecimal cartTotalPrice=new BigDecimal("0");

        if (CollectionUtils.isEmpty(cartInfos)){
            
        }else{
            for (CartInfo cartInfo : cartInfos) {
                CartGoodsVO cartGoodsVO=new CartGoodsVO();
                cartGoodsVO.setId(cartInfo.getcId());
                cartGoodsVO.setUserId(userId);
                cartGoodsVO.setGoodsId(cartInfo.getGoodId());

            }
        }
        return null;
    }
}
