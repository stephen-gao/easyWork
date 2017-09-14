package com.gs.framework.auth.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gs.framework.auth.dao.IAuthDao;
import com.gs.framework.auth.povo.Auth;
import com.gs.framework.auth.service.IAuthService;

@Service
public class AuthServiceImpl implements IAuthService{

	@Autowired
	private IAuthDao authDao;
	
	public List<Auth> findAll() {
		return this.authDao.findAll();
	}

	public Auth getAuthById(Integer id) {
		return this.authDao.getAuthById(id);
	}

	@Override
	public List<Auth> getAuthByUserId(Integer id) {
		return this.authDao.getAuthByUserId(id);
	}

	@Override
	public List<Auth> getAuthByRoleId(Integer id) {
		return this.authDao.getAuthByRoleId(id);
	}

}
