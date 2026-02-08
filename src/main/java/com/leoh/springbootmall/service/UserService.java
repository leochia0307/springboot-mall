package com.leoh.springbootmall.service;

import com.leoh.springbootmall.dto.UserRegisterRequest;
import com.leoh.springbootmall.model.User;
import jakarta.validation.Valid;

public interface UserService {

    User getById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

}
