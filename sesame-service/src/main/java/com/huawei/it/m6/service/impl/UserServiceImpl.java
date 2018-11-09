package com.huawei.it.m6.service.impl;/*
 * @author 片尾solo
 * @Date  2018/11/8  13:07
 */

import com.huawei.it.m6.dao.UserDao;
import com.huawei.it.m6.service.IUserSevice;
import com.huawei.it.m6.vo.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;


@Component
public class UserServiceImpl implements IUserSevice {
    
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;


    @Override
    public UserVO getUserByName(String name) {
        return userDao.getUserByName(name);
    }

    @Transactional
    @Override
    public boolean save(UserVO userVO) {
        boolean result = false;
        this.validate(userVO);
        try {
            userDao.save(userVO);
            result = true;
        }catch (Exception e){
            logger.error(" userDao.save(userVO) error ");
        }
        return result;
    }
    private void validate(UserVO userVO){

        if(StringUtils.isEmpty(userVO.getName())){
            return;
        };
    }

}
