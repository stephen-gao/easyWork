package com.gs.framework.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gs.framework.user.pojo.User;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView login(HttpServletRequest req){
		ModelAndView mv = new ModelAndView();
		mv.addObject("addport", req.getLocalAddr()+":"+req.getLocalPort());
		mv.setViewName("common/login");
		return mv;
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView login(User user,HttpServletRequest req){
		ModelAndView mv = new ModelAndView();
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
		try {
			subject.login(token);
			mv.setViewName("common/success");
		} catch (UnknownAccountException e) {
			mv.setViewName("common/error");
//			throw new BizException(ResultEnum.USER_ERROR.getMsg());
		} catch (IncorrectCredentialsException e) {
//			throw new BizException(ResultEnum.USER_ERROR.getMsg());
			mv.setViewName("common/error");
		} catch (AuthenticationException e) {
			// 其他错误，比如锁定，如果想单独处理请单独 catch 处理
//			throw new BizException(ResultEnum.USER_SHIRO_ERROR.getMsg());// 登录未知错误
			mv.setViewName("common/error");
		} catch (Exception e) {
//			throw new BizException(ResultEnum.INNER_ERROR.getMsg());// 最终在异常处理器生成未知错误
			mv.setViewName("common/error");
		}
		mv.addObject("addport", req.getLocalAddr()+":"+req.getLocalPort());
		return mv;
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest req){
		Subject subject = SecurityUtils.getSubject();
		if (subject.isAuthenticated()) {
			subject.logout();
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("addport", req.getLocalAddr()+":"+req.getLocalPort());
		mv.setViewName("common/login");
		return mv;
	}
	
}
