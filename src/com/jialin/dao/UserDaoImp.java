package com.jialin.dao;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.jialin.entity.User;

public class UserDaoImp implements IUserDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void AddUser(User user) {
		System.out.println("-------UserDaoImp.AddUser-----------"
				+ user.getName());
		getSession().save(user);
	}

	@Override
	public void modifyUser(User user) {
		System.out.println("-------UserDaoImp.modifyUser-----------"
				+ user.getName());
		getSession().update(user);
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("-------UserDaoImp.deleteUser-----------"
				+ user.getName());
		getSession().delete(user);
	}

	@Override
	public List<User> findPassAndUser(String name,String password) {
		// TODO Auto-generated method stub
		String hql = "from User as a where a.name = \'"+name+"\' and a.password = \'"+password+"\'";
		Query mQuery = getSession().createQuery(hql);
		return mQuery.list();
	}

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		String hql = "from User";
		Query mQuery = getSession().createQuery(hql);
		return mQuery.list();
	}
	
	


}
