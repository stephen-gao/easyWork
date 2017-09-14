package com.gs.framework.auth.dao;

import java.util.List;

import com.gs.framework.auth.povo.Auth;

public interface IAuthDao {
	
	public List<Auth> findAll();
	
	public Auth getAuthById(Integer id);
	
	public List<Auth> getAuthByUserId(Integer id);
	
	public List<Auth> getAuthByRoleId(Integer id);
}
