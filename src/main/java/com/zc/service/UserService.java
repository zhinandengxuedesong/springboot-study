package com.zc.service;

import com.zc.mapper.UserMapper;
import com.zc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @作者： zc
 * @时间： 2021/1/28 18:17
 * @描述： jdbc 和事务配置
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }

    // 事务
    @Transactional
    public void insertUser(User user){
        userMapper.insert(user);
    }

}
