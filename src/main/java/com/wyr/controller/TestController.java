package com.wyr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {
   @RequestMapping("/test")
    public  void  test(ServletRequest request){
       System.out.println("111111");
       
    }
}
