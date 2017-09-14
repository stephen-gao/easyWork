package com.gs.framework.role.dao;

import java.util.List;

import com.gs.framework.role.povo.Role;

public interface IRoleDao {
	
	public List<Role> findAll();
	
	public Role getRoleById(Integer id);
	
	public List<Role> getRoleByUserId(Integer id);
	
}
