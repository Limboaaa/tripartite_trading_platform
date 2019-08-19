package com.qf.vo;

import lombok.Data;

import java.math.BigDecimal;

public class CartGoodsVO {
    //结合了商品和购物车的一个抽象对象
    private Integer id;
    private Integer userId;
    private Integer goodsId;
    private Integer num;//购物车中此商品的数量
    private String goodName;
    private String goodSubtitle;
    private String goodMainImage;
    private BigDecimal goodPrice;
    private Integer goodStock;
    private Integer goodChecked;//此商品是否勾选

    private  String limitNum;//限制数量的一个返回结果

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodSubtitle() {
        return goodSubtitle;
    }

    public void setGoodSubtitle(String goodSubtitle) {
        this.goodSubtitle = goodSubtitle;
    }

    public String getGoodMainImage() {
        return goodMainImage;
    }

    public void setGoodMainImage(String goodMainImage) {
        this.goodMainImage = goodMainImage;
    }

    public BigDecimal getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(BigDecimal goodPrice) {
        this.goodPrice = goodPrice;
    }

    public Integer getGoodStock() {
        return goodStock;
    }

    public void setGoodStock(Integer goodStock) {
        this.goodStock = goodStock;
    }

    public Integer getGoodChecked() {
        return goodChecked;
    }

    public void setGoodChecked(Integer goodChecked) {
        this.goodChecked = goodChecked;
    }

    public String getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(String limitNum) {
        this.limitNum = limitNum;
    }

    @Override
    public String toString() {
        return "CartGoodsVO{" +
                "id=" + id +
                ", userId=" + userId +
                ", goodsId=" + goodsId +
                ", num=" + num +
                ", goodName='" + goodName + '\'' +
                ", goodSubtitle='" + goodSubtitle + '\'' +
                ", goodMainImage='" + goodMainImage + '\'' +
                ", goodPrice=" + goodPrice +
                ", goodStock=" + goodStock +
                ", goodChecked=" + goodChecked +
                ", limitNum='" + limitNum + '\'' +
                '}';
    }
}
