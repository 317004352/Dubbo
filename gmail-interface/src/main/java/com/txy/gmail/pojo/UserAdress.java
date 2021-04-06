package com.txy.gmail.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Classname UserAdress
 * @Description TODO
 * @Date 2021/4/5 18:06
 * @Created by txy
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserAdress implements Serializable {
        private Integer id;
        private String userAddress; //用户地址
        private String userId; //用户id
        private String consignee; //收货人
        private String phoneNum; //电话号码
        private String isDefault; //是否为默认地址    Y-是     N-否
        //get     set
        //有参构造  无参构造

}
