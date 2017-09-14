package com.gs.framework.user.service;

import java.util.List;

import com.gs.framework.user.pojo.User;

public interface IUserService {
	
	public List<User> findAll();
	
	public User getUserById(Integer id);
	
	public User getUserByName(String username);
	
	public User getUserByNP(User user);
}