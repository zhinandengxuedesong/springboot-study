package com.zc.controller;

import com.zc.pojo.User;
import com.zc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者： zc
 * @时间： 2021/1/29 10:26
 * @描述： Controller 层，获取数据返回页面
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public User hello() {
        User user = this.userService.queryById(1);
        return user;
    }
}
