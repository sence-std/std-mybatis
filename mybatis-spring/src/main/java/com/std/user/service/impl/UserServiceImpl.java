package com.std.user.service.impl;

import com.std.commons.exception.MybatisServiceException;
import com.std.commons.util.Check;
import com.std.user.dao.UserMapper;
import com.std.user.domain.User;
import com.std.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by sence on 2015/6/22.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource(name="userMapper")
    private UserMapper userMapper;

    /**
     *
     * @param user
     * @return
     * @throws MybatisServiceException
     */
    @Override
    public Integer saveUser(User user) throws MybatisServiceException {
       if(Check.isNull(user)){
           return null;
       }
       return userMapper.saveUser(null);
    }
}
