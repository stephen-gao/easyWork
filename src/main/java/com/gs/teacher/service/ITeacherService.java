package com.gs.teacher.service;

import com.github.pagehelper.PageInfo;
import com.gs.teacher.povo.Teacher;
import com.gs.teacher.povo.TeacherVO;

public interface ITeacherService {

	PageInfo<TeacherVO> findTeacherPage(TeacherVO vo);
	
	void save(Teacher po);
}
