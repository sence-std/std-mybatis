package com.std.user;

import com.std.user.dao.UserMapper;
import com.std.user.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by sence on 2015/6/21.
 */
public class T_UserDao {

    public static final String RESOURCE = "mybatis-config.xml";

    public SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream in = Resources.getResourceAsStream(RESOURCE);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
    }

    @Test
    public void testSelectUser(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectUser(1);
        Assert.assertNotNull(user);
        Assert.assertEquals(user.getUserLoginName(),"sence");
        sqlSession.close();
    }

    @Test
    public void testSaveUser(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUserAge(12);
        user.setUserPassword("shengqi123");
        user.setUserLoginName("月月");
        user.setUserName("若若");
        Integer records = userMapper.saveUser(user);
        sqlSession.commit();
        System.out.println(user.getUserId());
        Assert.assertNotNull(records);
    }

}
