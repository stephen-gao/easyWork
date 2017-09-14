package com.gs.framework.user.pojo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.gs.framework.auth.povo.Auth;
import com.gs.framework.role.povo.Role;

public class ActiveUser implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2698622476157224683L;
	
	private Integer id;
	private String name;
	private String password;
	private List<Auth> auths;
	private List<Role> roles;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Auth> getAuths() {
		return auths;
	}
	public void setAuths(List<Auth> auths) {
		this.auths = auths;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	
}
