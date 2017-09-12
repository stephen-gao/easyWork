package com.gs.teacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.gs.framework.base.BaseResult;
import com.gs.teacher.povo.TeacherVO;
import com.gs.teacher.service.ITeacherService;

@Controller
@RequestMapping("teacher")
public class TeacherController {

	@Autowired
	private ITeacherService teacherService;
	
	@RequestMapping(value = "/findTeacherPage", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public BaseResult<PageInfo<TeacherVO>> findTeacherPage(TeacherVO vo){
		PageInfo<TeacherVO> page = teacherService.findTeacherPage(vo); 
		return new BaseResult<PageInfo<TeacherVO>>(true, page);
	}
}
