package com.qf.pojo;

import lombok.Data;

@Data
public class CartInfo {

    int cId;
    String cName;
    double Cprice;
    int num;
    int buyerId;
    int checked;
    Data careteTime;
    Data updateTime;
    int gameId;
    int goodId;

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public double getCprice() {
        return Cprice;
    }

    public void setCprice(double cprice) {
        Cprice = cprice;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }

    public int getChecked() {
        return checked;
    }

    public void setChecked(int checked) {
        this.checked = checked;
    }

    public Data getCareteTime() {
        return careteTime;
    }

    public void setCareteTime(Data careteTime) {
        this.careteTime = careteTime;
    }

    public Data getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Data updateTime) {
        this.updateTime = updateTime;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    @Override
    public String toString() {
        return "CartInfo{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                ", Cprice=" + Cprice +
                ", num=" + num +
                ", buyerId=" + buyerId +
                ", checked=" + checked +
                ", careteTime=" + careteTime +
                ", updateTime=" + updateTime +
                ", gameId=" + gameId +
                ", goodId=" + goodId +
                '}';
    }
}
