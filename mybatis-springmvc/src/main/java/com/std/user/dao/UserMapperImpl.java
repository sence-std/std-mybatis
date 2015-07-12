package com.std.user.dao;

import com.std.common.MybatisDaoContext;
import com.std.user.domain.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by sence on 2015/7/12.
 */
@Repository("userMapper")
public class UserMapperImpl implements UserMapper {

    public final static String SQL_ID = "com.std.user.dao.UserMapper";

    @Resource(name="mybatisDaoContext")
    private MybatisDaoContext mybatisDaoContext;

    @Override
    public Integer saveUser(User user) {
        return mybatisDaoContext.insert(SQL_ID+".saveUser",user);
    }

    @Override
    public User selectUser(Integer userId) {
        return mybatisDaoContext.selectOne(SQL_ID + ".selectUser",userId);
    }
}
