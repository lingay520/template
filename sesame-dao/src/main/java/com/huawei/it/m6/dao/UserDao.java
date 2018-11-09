package com.huawei.it.m6.dao;/*
 * @author 片尾solo
 * @Date  2018/11/8  13:09
 */

import com.huawei.it.m6.vo.UserVO;

public interface UserDao {

    UserVO getUserByName(String name);
    void save(UserVO userVO);
}
