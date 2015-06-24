package com.std.user.controller;

import com.std.commons.exception.MybatisServiceException;
import com.std.user.domain.User;
import com.std.user.service.UserService;
import com.sun.istack.internal.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by sence on 2015/6/24.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource(name="userService")
    private UserService userService;

    @RequestMapping(value = "/{userId}",method = {RequestMethod.GET})
    public @ResponseBody User load(@PathVariable Integer userId) throws MybatisServiceException {
        User user = userService.findUser(userId);
        return user;
    }

}
