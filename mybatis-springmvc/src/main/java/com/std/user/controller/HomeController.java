package com.std.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sence on 2015/7/2.
 */
@Controller
@RequestMapping("")
public class HomeController {

    @RequestMapping("")
    public String home(){
        return "index";
    }

}
