package com.huawei.it.m6.service;/*
 * @author 片尾solo
 * @Date  2018/11/8  13:06
 */

import com.huawei.it.m6.vo.UserVO;

public interface IUserSevice {
    UserVO getUserByName(String name);

    boolean save(UserVO userVO);

}
