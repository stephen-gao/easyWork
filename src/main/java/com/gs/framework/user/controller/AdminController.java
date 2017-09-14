package com.gs.framework.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	
	@RequestMapping(value="/adminPage",method=RequestMethod.GET)
	public ModelAndView adminPage(HttpServletRequest req){
		ModelAndView mv = new ModelAndView();
		mv.addObject("addport", req.getLocalAddr()+":"+req.getLocalPort());
		mv.setViewName("admin/adminPage");
		return mv;
	}	
}
