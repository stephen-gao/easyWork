package com.gs.framework.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gs.framework.user.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService UserService;
	
	@RequestMapping(value="/userPage",method=RequestMethod.GET)
	public ModelAndView userPage(HttpServletRequest req){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user/userPage");
		mv.addObject("addport", req.getLocalAddr()+":"+req.getLocalPort());
		return mv;
	}
}
