package com.qf.pojo;

import lombok.Data;

/**
 *卖家用户信息
 * author GuiYuan Zhang
 */
@Data
public class Seller {
    long sellerId;
    String userName;
    String password;
    String email;
    long phone;
    int status;
    //身份证号
    long idNumber;
    //头像
    String portrait;
}
