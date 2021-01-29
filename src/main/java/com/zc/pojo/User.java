package com.zc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * @作者： zc
 * @时间： 2021/1/28 17:02
 * @描述： 实体类
 *          lombok 依赖注解 @Data 加载属性 getter setter 方法
 */
@Table(name = "user_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private String realname;
    private String birthday;
    private Integer gender;
    private String createtime;
    private String updatetime;
}
