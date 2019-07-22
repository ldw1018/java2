package com.bdqn.oop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ldwjava
 * @Date 2018/6/2 9:37
 * @Desc TODO
 **/

@RestController
public class UserConroller {

    @RequestMapping("/index")
    public String index() {
        return "hello boot";
    }
}
