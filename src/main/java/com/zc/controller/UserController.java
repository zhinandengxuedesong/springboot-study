package com.zc.controller;

import com.zc.pojo.User;
import com.zc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

/**
 * @作者： zc
 * @时间： 2021/1/29 10:26
 * @描述： Controller 层，获取数据返回页面
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello/{id}")
    public User hello(@PathVariable("id") int id) {
        User user = this.userService.queryById(id);
        return user;
    }

    @GetMapping("/selAll")
    public List<User> selAll(){
        List<User> users = this.userService.selAll();
        return users;
    }

    @GetMapping("/insert")
    public void insert(){
        // 插入一条数据
        this.userService.insertUser(new User(
                4,
                "mawu",
                "dsgds21",
                "麻五",
                "2020-11-17",
                1,
                "2020-11-17 11:04:17",
                "2020-11-17 11:14:12"
        ));
    }
}
