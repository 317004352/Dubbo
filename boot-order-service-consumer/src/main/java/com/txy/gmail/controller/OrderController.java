package com.txy.gmail.controller;

import com.txy.gmail.pojo.UserAdress;
import com.txy.gmail.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Classname OrderController
 * @Description TODO
 * @Date 2021/4/6 9:23
 * @Created by txy
 */
@Controller
public class OrderController {
    @Autowired
    OrderService orderService;
   @ResponseBody
    @RequestMapping("/initOrder")
    public List<UserAdress> initOrder(@RequestParam("uid")String userId){

return  orderService.initOrder(userId)   ;}
}
