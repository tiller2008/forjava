package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: AdminController
 * @Description: TODO
 * @Author: Bob Wu
 * @Date: 6/29/2018 3:06 PM
 * @Version: 1.0
 **/
@Controller
public class AdminController {

    /**
     * @Author: Bob Wu
     * @Description: 管理页面登录
     * @Date: 6/29/2018 3:07 PM
     * @Param: []
     * @return: java.lang.String
     * @Version: 1.0
     **/
    @GetMapping("/admin/login")
    public String login() {
        return "login";
    }
}
