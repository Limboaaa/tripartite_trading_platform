package com.qf.vo;

import java.math.BigDecimal;
import java.util.List;

public class CartVO {
   private List<CartGoodsVO> cartGoodsVOList;
   private BigDecimal cartTotalPrice;//商品总价
    private Boolean allChecked;//是否都已勾选
    private String imageHost;//购物车图片地址

    public List<CartGoodsVO> getCartGoodsVOList() {
        return cartGoodsVOList;
    }

    public void setCartGoodsVOList(List<CartGoodsVO> cartGoodsVOList) {
        this.cartGoodsVOList = cartGoodsVOList;
    }

    public BigDecimal getCartTotalPrice() {
        return cartTotalPrice;
    }

    public void setCartTotalPrice(BigDecimal cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
    }

    public Boolean getAllChecked() {
        return allChecked;
    }

    public void setAllChecked(Boolean allChecked) {
        this.allChecked = allChecked;
    }

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }

    @Override
    public String toString() {
        return "CartVO{" +
                "cartGoodsVOList=" + cartGoodsVOList +
                ", cartTotalPrice=" + cartTotalPrice +
                ", allChecked=" + allChecked +
                ", imageHost='" + imageHost + '\'' +
                '}';
    }
}
