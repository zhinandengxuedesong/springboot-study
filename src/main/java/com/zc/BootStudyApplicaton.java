package com.zc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @作者： zc
 * @时间： 2021/1/28 17:30
 * @描述： SpringBoot 启动类
 */
@SpringBootApplication
// 注意使用了导入通用 mapper 包下 tk.mybatis....MapperScan
@MapperScan({"com.zc.mapper"})
public class BootStudyApplicaton {
    public static void main(String[] args) {
        SpringApplication.run(BootStudyApplicaton.class, args);
    }
}
