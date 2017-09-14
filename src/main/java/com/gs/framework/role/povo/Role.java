package com.gs.framework.role.povo;

import java.io.Serializable;

public class Role implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5729093801540790654L;
	private java.lang.Integer 	id;
	private java.lang.String 	roleName;
	public java.lang.Integer getId() {
		return id;
	}
	public void setId(java.lang.Integer id) {
		this.id = id;
	}
	public java.lang.String getRoleName() {
		return roleName;
	}
	public void setRoleName(java.lang.String roleName) {
		this.roleName = roleName;
	}
	
	
	
}
