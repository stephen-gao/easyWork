package com.gs.framework.auth.povo;

import java.io.Serializable;

public class Auth implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6143181883005617881L;
	private java.lang.Integer 	id;
	private java.lang.String 	authName;
	public java.lang.Integer getId() {
		return id;
	}
	public void setId(java.lang.Integer id) {
		this.id = id;
	}
	public java.lang.String getAuthName() {
		return authName;
	}
	public void setAuthName(java.lang.String authName) {
		this.authName = authName;
	}
	
	
}
