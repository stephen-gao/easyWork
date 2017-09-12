package com.gs.teacher.dao;

import java.util.List;

import com.gs.teacher.povo.Teacher;
import com.gs.teacher.povo.TeacherVO;

public interface ITeacherDao {

	List<TeacherVO> findAll();
	
	void insert(Teacher po);
	
	void update(Teacher po);
	
	void delete(Integer id);
	
	TeacherVO getVOById(Integer id);
}
