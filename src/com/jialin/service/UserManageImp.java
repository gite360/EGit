package com.jialin.service;

import java.util.List;

import javax.annotation.Resource;

import com.jialin.dao.IUserDao;
import com.jialin.entity.User;

public class UserManageImp implements IUserManage {
	
	@Resource  
	private IUserDao userDao;
	
	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addUser(User user) {
		System.out.println("------UserManageImp.adddUser--------"+user.getName());
		userDao.AddUser(user);
		
	}

	@Override
	public void modifyUser(User user) {
		System.out.println("------UserManageImp.modifyUser--------"+user.getName());
		userDao.modifyUser(user);

	}

	@Override
	public void deleteUser(User user) {
		System.out.println("------UserManageImp.deleteUser--------"+user.getName());
		userDao.deleteUser(user);
	}

	@Override
	public boolean valiteLogin(String name, String password) {
		// TODO Auto-generated method stub
		System.out.println("------UserManageImp.valiteLogin--------"+name);
		List<User>  list = userDao.findPassAndUser(name, password);
		if(list!=null && list.size() > 0){
			return true;
		}
		return false;
	}

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return userDao.findAllUser();
	}
}
