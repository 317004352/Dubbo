package com.txy.gmail.service;

import com.txy.gmail.pojo.UserAdress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname OrderServiceimpl
 * @Description TODO
 * @Date 2021/4/5 18:53
 * @Created by txy
 */
@Service
public class OrderServiceimpl implements OrderService{
    @Autowired
public UserService userService;
    public List<UserAdress> initOrder(String userID) {

        //查询用户的收货地址
        List<UserAdress> userAddressList = userService.getUserAddressList(userID);

        //为了直观的看到得到的数据，以下内容也可不写
        System.out.println("当前接收到的userId=> "+userID);
        System.out.println("**********");
        System.out.println("查询到的所有地址为：");
//        for (UserAdress userAddress : userAddressList) {
//            //打印远程服务地址的信息
////            System.out.println(userAddress.getUserAddress());
//    }
        return userAddressList;
    }
}
