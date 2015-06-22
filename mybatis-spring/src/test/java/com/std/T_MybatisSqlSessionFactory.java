package com.std;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Assert;
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
public class T_MybatisSqlSessionFactory {

    @Resource(name="sqlSessionFactory")
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void testSqlSessionFactory(){
        Assert.assertNotNull(sqlSessionFactory);
    }

}
