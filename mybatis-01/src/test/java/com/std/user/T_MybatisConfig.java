package com.std.user;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by sence on 2015/6/21.
 */
public class T_MybatisConfig {

    public static final String RESOURCE = "mybatis-config.xml";

    @Test
    public void testMybatisConfig() throws IOException {
        InputStream in = Resources.getResourceAsStream(RESOURCE);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Assert.assertNotNull(sqlSessionFactory);
        Assert.assertNotNull(sqlSession);
        sqlSession.close();
    }

}
