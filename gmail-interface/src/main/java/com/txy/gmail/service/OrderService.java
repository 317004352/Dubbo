package com.txy.gmail.service;

import com.txy.gmail.pojo.UserAdress;

import java.util.List;

/**
 * @Classname OrderService
 * @Description TODO
 * @Date 2021/4/5 18:52
 * @Created by txy
 */
public interface OrderService {
    public List<UserAdress> initOrder(String userID);
}
