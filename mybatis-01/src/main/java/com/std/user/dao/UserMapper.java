package com.std.user.dao;

import com.std.user.domain.User;

import java.util.List;

/**
 * Created by sence on 2015/6/21.
 */
public interface UserMapper {

    /**
     * 保存用户
     * @param user
     * @return
     */
  //  public int saveUser(User user);

    /**
     * 更新用户
     * @param user
     * @return
     */
 //   public int updateUser(User user);

    /**
     * 查找用户
     * @param userId
     * @return
     */
    public User selectUser(Integer userId);

    /**
     * 查找users
     * @param user
     * @return
     */
  //  public List<User> selectUsers(User user);

}
