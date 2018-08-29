package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @Author: Bob Wu
 * @Date: 6/27/2018 9:33 AM
 * @Version: 1.0
 **/
public interface UserService {
    public User selectByPrimaryKey(Long id);
}
