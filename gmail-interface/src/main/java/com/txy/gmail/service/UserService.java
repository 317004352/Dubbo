package com.txy.gmail.service;



import com.txy.gmail.pojo.UserAdress;

import java.util.List;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2021/4/5 18:12
 * @Created by txy
 */
public interface UserService {
    /**
     * 按照用户id返回所有的收货地址
     * @param userId
     * @return
     */
    public List<UserAdress> getUserAddressList(String userId);
}
