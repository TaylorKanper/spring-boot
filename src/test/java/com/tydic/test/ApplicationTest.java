package com.tydic.test;

import com.tydic.bean.UserBean;
import com.tydic.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {
    @Autowired
    private IUserService userService;

    @Test
    public void test() {
        UserBean user = userService.findUserByUserName("张飞");
        System.err.println("user = " + user);
    }
}
