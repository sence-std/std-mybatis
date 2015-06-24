package com.std.user.service;

import com.std.commons.exception.MybatisServiceException;
import com.std.user.domain.User;

/**
 * Created by sence on 2015/6/22.
 */
public interface UserService {

    /**
     * 保存用户，返回用户ID 并返回插入影响记录行数
     * @param user
     * @throws MybatisServiceException
     */
    public Integer saveUser(User user)throws MybatisServiceException;

    /**
     *  查找用户
     * @param userId
     * @return
     * @throws MybatisServiceException
     */
    public User findUser(Integer userId)throws MybatisServiceException;

}
