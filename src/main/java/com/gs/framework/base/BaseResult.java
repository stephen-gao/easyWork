package com.gs.framework.base;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 
 * @ClassName: BaseResult
 * @Description: ajax 请求的返回类型封装JSON结果
 * @author: XieDong
 * @date: 2017年3月12日 上午11:44:43
 * @param <T>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResult<T> implements Serializable {

	private static final long serialVersionUID = -4185151304730685014L;

	private boolean success;

	private T data;

	private String msg;

	// 2017年4月17日 11:18:49 为了 302 状态码 加的字段
	private int code;
	private String location;

	public BaseResult(boolean success, String msg) {
		this.success = success;
		this.msg = msg;
	}

	public BaseResult(boolean success, T data) {
		this.success = success;
		this.data = data;
	}

	public BaseResult(boolean success) {
		this.success = success;
	}

	public BaseResult(boolean success, int code, String location) {
		this.success = success;
		this.code = code;
		this.location = location;
	}

	
	

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	/* (non Javadoc)
	 * @Title: toString
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BaseResult [success=" + success + ", data=" + data + ", msg=" + msg + ", code=" + code + ", location="
				+ location + "]";
	}

}
