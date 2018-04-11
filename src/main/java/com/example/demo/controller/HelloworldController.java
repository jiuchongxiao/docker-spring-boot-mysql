package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2018/4/10.
 */
@RestController
//@RequestMapping("hello")
public class HelloworldController {

    @RequestMapping("hello")
    public String helloWorld(){

        return "hello world ,this is docker spring boot test.";
    }
}
