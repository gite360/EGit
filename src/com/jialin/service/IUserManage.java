package com.jialin.service;

import java.util.List;

import com.jialin.entity.User;

public interface IUserManage {
	public void addUser(User user);
	public void modifyUser(User user);
	public void deleteUser(User user);
	public List<User> findAllUser();
	public boolean valiteLogin(String name,String password);
}
