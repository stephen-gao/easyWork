package com.gs.teacher.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gs.framework.constant.Constant;
import com.gs.teacher.dao.ITeacherDao;
import com.gs.teacher.povo.Teacher;
import com.gs.teacher.povo.TeacherVO;
import com.gs.teacher.service.ITeacherService;

@Service
public class TeacherServiceImpl implements ITeacherService{

	@Autowired
	private ITeacherDao teacherDao;

	@Override
	public PageInfo<TeacherVO> findTeacherPage(TeacherVO vo) {
		PageHelper.startPage(null!=vo.getPageNum()?vo.getPageNum():Constant.PAGE_NUMBER.getNumber(), null!=vo.getPageSize()?vo.getPageSize():Constant.PAGE_SIZE.getNumber());
		List<TeacherVO> list = teacherDao.findAll();
		return new PageInfo<TeacherVO>(list);
	}

	@Override
	public void save(Teacher po) {
		teacherDao.insert(po);
	}
	
	
}
