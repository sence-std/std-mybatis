package com.std.user;

import com.std.user.dao.UserMapper;
import com.std.user.domain.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by sence on 2015/6/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class T_UserMapper {

    @Resource(name="userMapper")
    private UserMapper userMapper;

    @Before
    public void testUserMapper(){
        Assert.assertNotNull(userMapper);
    }

    @Test
    public void testSaveUser(){
        User user = new User();
        user.setUserLoginName("首都师");
        user.setUserPassword("123456");
        user.setUserName("第三代");
        userMapper.saveUser(user);
    }

    @Test
    public void testSelectUser(){
        userMapper.selectUser(1);
    }


}
