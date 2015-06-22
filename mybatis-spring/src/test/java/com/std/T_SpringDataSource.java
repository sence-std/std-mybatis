package com.std;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by sence on 2015/6/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class T_SpringDataSource {

    @Resource(name="dataSource")
    private DataSource dataSource;

    @Test
    public void testDataSource(){
        Assert.assertNotNull(dataSource);
    }



}
