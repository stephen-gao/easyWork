package com.gs.teacher.povo;

import java.io.Serializable;

public class Teacher implements Serializable{

	private static final long serialVersionUID = 8698265836607765915L;
	
	private java.lang.Integer id;
	private java.lang.String name;
	private java.lang.Integer gender;
	private java.lang.String tel;
	
	public java.lang.Integer getId() {
		return id;
	}
	public void setId(java.lang.Integer id) {
		this.id = id;
	}
	public java.lang.String getName() {
		return name;
	}
	public void setName(java.lang.String name) {
		this.name = name;
	}
	public java.lang.Integer getGender() {
		return gender;
	}
	public void setGender(java.lang.Integer gender) {
		this.gender = gender;
	}
	public java.lang.String getTel() {
		return tel;
	}
	public void setTel(java.lang.String tel) {
		this.tel = tel;
	}

	
}
