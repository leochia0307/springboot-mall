package com.leoh.springbootmall.service.impl;

import com.leoh.springbootmall.dao.UserDao;
import com.leoh.springbootmall.dto.UserRegisterRequest;
import com.leoh.springbootmall.model.User;
import com.leoh.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }


}
