package com.jialin.dao;

import java.util.List;

import com.jialin.entity.User;

public interface IUserDao {
	public void AddUser(User user);
	public void modifyUser(User user);
	public void deleteUser(User user);
	public List<User> findAllUser();
	public List<User> findPassAndUser(String name,String password);
}
