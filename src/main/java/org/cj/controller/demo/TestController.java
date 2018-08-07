package org.cj.controller.demo;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.cj.service.demo.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/test/")
public class TestController
{
	@Resource
	private TestService testService;
	
	//返回一个View ，并且绑定数据
    @RequestMapping(value = "hello", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView hello(Model model, HttpServletRequest request, HttpServletResponse response, HttpSession session) {

    	//return "hello";
    	 ModelAndView mv = new ModelAndView();
		try
		{
			testService.insertData();
			 
				mv.addObject("a", "插入数据成功!");
				mv.setViewName("hello");
				return mv;
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			mv.addObject("a", "插入数据异常!"+e.getMessage());
			mv.setViewName("hello");
			return mv;
		}
		
    }
}
