package com.std.user.dao;

import com.std.user.domain.User;

import java.util.List;

/**
 * Created by sence on 2015/6/21.
 */
public interface UserMapper {

    /**
     * �����û�
     * @param user
     * @return
     */
  //  public int saveUser(User user);

    /**
     * �����û�
     * @param user
     * @return
     */
 //   public int updateUser(User user);

    /**
     * �����û�
     * @param userId
     * @return
     */
    public User selectUser(Integer userId);

    /**
     * ����users
     * @param user
     * @return
     */
  //  public List<User> selectUsers(User user);

}
