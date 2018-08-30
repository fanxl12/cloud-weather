package com.fanxl.weather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author: fanxl
 * @date: 2018/8/30 0030 16:43
 */
@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        return "hello, fanxl";
    }


}
