package com.zc.http;

import com.zc.BootStudyApplicaton;
import com.zc.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

/**
 * @作者： zc
 * @时间： 2021/2/2 11:03
 * @描述： 测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootStudyApplicaton.class)
public class HttpDemoApplicationTests {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void httpGet() {
        User user = this.restTemplate.getForObject("http://localhost/hello/1", User.class);
        System.out.println(user);
    }
}
