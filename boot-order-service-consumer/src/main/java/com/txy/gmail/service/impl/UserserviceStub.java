package com.txy.gmail.service.impl;

import com.txy.gmail.pojo.UserAdress;
import com.txy.gmail.service.UserService;
import org.jboss.netty.util.internal.StringUtil;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Classname UserserviceStub
 * @Description TODO
 * @Date 2021/4/6 14:03
 * @Created by txy
 */
public class UserserviceStub implements UserService {
    private final UserService userService;
//传入userservice远程代理对象
    public UserserviceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAdress> getUserAddressList(String userId) {
        if(!StringUtils.isEmpty(userId)){
            return  userService.getUserAddressList(userId);
        }
        return null;
    }
}
