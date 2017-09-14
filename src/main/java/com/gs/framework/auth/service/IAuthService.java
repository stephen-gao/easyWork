package com.gs.framework.auth.service;

import java.util.List;

import com.gs.framework.auth.povo.Auth;

public interface IAuthService {
	
	public List<Auth> findAll();
	
	public Auth getAuthById(Integer id);
	
	public List<Auth> getAuthByRoleId(Integer id);

	public List<Auth> getAuthByUserId(Integer id);
}
