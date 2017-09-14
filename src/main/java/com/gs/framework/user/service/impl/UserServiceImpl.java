package com.gs.framework.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gs.framework.user.dao.IUserDao;
import com.gs.framework.user.pojo.User;
import com.gs.framework.user.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	public List<User> findAll() {
		return this.userDao.findAll();
	}

	public User getUserById(Integer id) {
		return this.userDao.getUserById(id);
	}

	public User getUserByName(String username) {
		return this.userDao.getUserByName(username);
	}

	public User getUserByNP(User user) {
		return this.userDao.getUserByNP(user);
	}

}