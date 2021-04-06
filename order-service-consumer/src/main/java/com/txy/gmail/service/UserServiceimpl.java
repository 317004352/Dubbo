package com.txy.gmail.service;

import com.txy.gmail.pojo.UserAdress;

import java.util.Arrays;
import java.util.List;

/**
 * @Classname UserServiceimpl
 * @Description TODO
 * @Date 2021/4/5 18:12
 * @Created by txy
 */
public class UserServiceimpl {

    public List<UserAdress> getUserAddressList(String userId) {

        UserAdress address1 = new UserAdress(1, "河南省郑州巩义市宋陵大厦2F", "1", "安然", "150360313x", "Y");
        UserAdress address2 = new UserAdress(2, "北京市昌平区沙河镇沙阳路", "1", "情话", "1766666395x", "N");

        return Arrays.asList(address1, address2);
    }
}
