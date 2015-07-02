package com.std.user.controller;

import com.std.commons.exception.MybatisServiceException;
import com.std.user.domain.User;
import com.std.user.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sence on 2015/6/24.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(value = "/{userId}", method = {RequestMethod.GET})
    public
    @ResponseBody
    User load(@PathVariable Integer userId) throws MybatisServiceException {
        User user = userService.findUser(userId);
        return user;
    }

    @RequestMapping(value = "/add", method = {RequestMethod.POST})
    public ResponseEntity<Map<String, Object>> save(@Valid User user, BindingResult result) throws MybatisServiceException {
        Map<String, Object> map = new HashMap<>();
        if (result.hasErrors()) {
            List<FieldError> errors = result.getFieldErrors();
            for (FieldError error : errors) {
                map.put("status", "ERROR");
                map.put(error.getField(), error.getDefaultMessage());
            }
            return new ResponseEntity(map, HttpStatus.OK);
        }
        userService.saveUser(user);
        map.put("status", "ERROR");
        map.put("user", user);
        return new ResponseEntity(map, HttpStatus.OK);
    }
}
