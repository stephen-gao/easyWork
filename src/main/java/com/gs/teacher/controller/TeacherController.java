package com.gs.teacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.gs.framework.base.BaseResult;
import com.gs.teacher.povo.Teacher;
import com.gs.teacher.povo.TeacherVO;
import com.gs.teacher.service.ITeacherService;

@Controller
@RequestMapping("teacher")
public class TeacherController {

	@Autowired
	private ITeacherService teacherService;
	
	@RequestMapping(value = "/getTeachers", method = RequestMethod.GET)
	@ResponseBody
	public BaseResult<PageInfo<TeacherVO>> getTeachers(TeacherVO vo){
		PageInfo<TeacherVO> page = teacherService.findTeacherPage(vo); 
		return new BaseResult<PageInfo<TeacherVO>>(true, page);
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public BaseResult<Teacher> save(Teacher po){
		teacherService.save(po); 
		return new BaseResult<Teacher>(true, "添加成功");
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	@ResponseBody
	public BaseResult<Teacher> update(Teacher po){
		teacherService.update(po); 
		return new BaseResult<Teacher>(true, "更新成功");
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public BaseResult<Teacher> update(@PathVariable("id")Integer id){
		teacherService.delete(id); 
		return new BaseResult<Teacher>(true, "删除成功");
	}
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	@ResponseBody
	public BaseResult<TeacherVO> get(@PathVariable("id")Integer id){
		TeacherVO vo = teacherService.getVOById(id); 
		return new BaseResult<TeacherVO>(true, vo);
	}
}
