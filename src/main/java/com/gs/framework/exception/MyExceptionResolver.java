package com.gs.framework.exception;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.support.HandlerMethodResolver;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerExceptionResolverComposite;

@Component
public class MyExceptionResolver implements HandlerExceptionResolver {
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@ResponseBody
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex){
		
		response.setContentType(MediaType.APPLICATION_JSON_VALUE); //设置ContentType  
		response.setCharacterEncoding("UTF-8"); //避免乱码  
		response.setHeader("Cache-Control", "no-cache, must-revalidate");
		
		int responseCode = 500;
		response.setStatus(responseCode);
		System.out.println(ex.getMessage());
		ModelAndView mv = new ModelAndView();
		mv.addObject("errorMsg", ex.getMessage());
		mv.setViewName("exception");
		return mv;
	}
}