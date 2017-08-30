package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 文清 on 2017/8/30.
 */
@Controller
public class HelloController {

    @RequestMapping(path = "/hello")
    @ResponseBody
    public String hello(){
        return "hello world";
    }
}
