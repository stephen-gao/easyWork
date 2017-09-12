package com.gs.framework.constant;

public enum Constant {

	PAGE_NUMBER(1,"第一页"),
	PAGE_SIZE(10,"每页10条数据");
	
	private int number;

	private String msg;

	Constant(int number, String msg) {
		this.number = number;
		this.msg = msg;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
}
