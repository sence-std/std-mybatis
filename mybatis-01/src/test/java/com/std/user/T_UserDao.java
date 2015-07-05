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
import java.util.List;

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
        User user = userMapper.selectUser(2);
        Assert.assertNotNull(user);
        Assert.assertEquals(user.getUserLoginName(),"月月");
        System.out.println(user.getUserPassword());
        sqlSession.close();
    }

    @Test
    public void testSaveUser(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUserAge(12);
        user.setUserPassword("shengqi123");
        user.setUserLoginName("123");
        user.setUserName("活动");
        Integer records = userMapper.saveUser(user);
        sqlSession.commit();
        System.out.println(user.getUserId());
        Assert.assertNotNull(records);
    }
    
    @Test
    public void testUpdateUser(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        
        User user = new User();
        user.setUserId(1);
        user.setUserAge(12);
        user.setUserPassword("shengqi123");
        user.setUserLoginName("涛涛");
        user.setUserName("涛涛");
        Integer records = userMapper.updateUser(user);
        sqlSession.commit();
        System.out.println(user.getUserId());
        Assert.assertNotNull(records);
    }
    @Test
    public void testDeleteUser(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        
        User user = new User();
        
        user.setUserId(1);
        Integer records = userMapper.deleteUser(1);
        sqlSession.commit();
        System.out.println(user.getUserId());
        Assert.assertNotNull(records);
    }
    

    @Test
    public void testSelectUsers(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> listUser = userMapper.selectUsers(10);
       
        System.out.println(listUser);
        sqlSession.close();
    }

}
