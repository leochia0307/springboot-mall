package com.leoh.springbootmall.dao;

import com.leoh.springbootmall.dto.UserRegisterRequest;
import com.leoh.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);

}
