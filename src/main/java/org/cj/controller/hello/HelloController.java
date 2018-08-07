/*
 * Copyright (c) 2014-2016, www.17yop.com
 * 
 * All rights reserved.
 */
package org.cj.controller.hello;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Hello控制器。
 * 
 */
@Controller
@RequestMapping(value = "/hello")
public class HelloController {

	//返回一个View ，并且绑定数据
    @RequestMapping(value = "", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView hello(Model model, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        System.out.println("hello world");
        //return "hello";
        ModelAndView mv = new ModelAndView();
		mv.addObject("a", "你好，WELCOME  Spring MVC!");
		mv.setViewName("hello");
		return mv;
    }
    
  //返回一个View ，并且绑定数据
    @RequestMapping(value = "hellostr", method = { RequestMethod.GET, RequestMethod.POST })
    public String hellostr(Model model, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        System.out.println("hello world");
        //return "hello";
		return "hello";
    }
}
