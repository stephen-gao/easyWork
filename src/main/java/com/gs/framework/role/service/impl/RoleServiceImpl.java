package com.gs.framework.role.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gs.framework.role.dao.IRoleDao;
import com.gs.framework.role.povo.Role;
import com.gs.framework.role.service.IRoleService;

@Service
public class RoleServiceImpl implements IRoleService{

	@Autowired
	private IRoleDao roleDao;
	
	public List<Role> findAll() {
		return this.roleDao.findAll();
	}

	public Role getRoleById(Integer id) {
		return this.roleDao.getRoleById(id);
	}

	@Override
	public List<Role> getRoleByUserId(Integer id) {
		return this.roleDao.getRoleByUserId(id);
	}

}
