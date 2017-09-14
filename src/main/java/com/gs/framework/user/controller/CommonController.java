package com.gs.framework.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonController {

	@RequestMapping(value="/success",method=RequestMethod.GET)
	public ModelAndView success(HttpServletRequest req){
		ModelAndView mv = new ModelAndView();
		mv.addObject("addport", req.getLocalAddr()+":"+req.getLocalPort());
		mv.setViewName("common/success");
		return mv;
	}
	
	@RequestMapping(value="/error",method=RequestMethod.GET)
	public ModelAndView error(HttpServletRequest req){
		ModelAndView mv = new ModelAndView();
		mv.addObject("addport", req.getLocalAddr()+":"+req.getLocalPort());
		mv.setViewName("common/error");
		return mv;
	}
	
	@RequestMapping(value="/unAuthorized",method=RequestMethod.GET)
	public ModelAndView unAuthorized(HttpServletRequest req){
		ModelAndView mv = new ModelAndView();
		mv.addObject("addport", req.getLocalAddr()+":"+req.getLocalPort());
		mv.setViewName("common/unAuthorized");
		return mv;
	}
	
}
