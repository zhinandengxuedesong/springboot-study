package com.zc.mapper;

import com.zc.pojo.User;
import tk.mybatis.mapper.common.Mapper;

/**
 * @作者： zc
 * @时间： 2021/1/28 18:18
 * @描述： 映射接口类，实现数据表操作
 */

public interface UserMapper extends Mapper<User> {
    // 本通用 mapper 实现了单表的增删改查方法
}
