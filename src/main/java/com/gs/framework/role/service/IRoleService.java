package com.gs.framework.role.service;

import java.util.List;

import com.gs.framework.role.povo.Role;

public interface IRoleService {
	
	public List<Role> findAll();
	
	public Role getRoleById(Integer id);
	
	public List<Role> getRoleByUserId(Integer id);
}
