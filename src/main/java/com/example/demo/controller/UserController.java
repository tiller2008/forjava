package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: UserController
 * @Description: 用户页面
 * @Author: Bob Wu
 * @Date: 6/27/2018 9:31 AM
 * @Version: 1.0
 **/
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public Object user(){
        return userService.selectByPrimaryKey(1L);
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
