package com.jialin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.jialin.entity.Shop;

public class ShopDaoImp implements IShopDao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}


	@Override
	public void AddShop(Shop shop) {
		// TODO Auto-generated method stub
		System.out.println("-------ShopDaoImp.AddShop-----------"
				+ shop.getName());
		getSession().save(shop);
	}

	@Override
	public void deleteShop(Shop shop) {
		// TODO Auto-generated method stub
		System.out.println("-------ShopDaoImp.deleteShop-----------"
				+ shop.getName());
		getSession().delete(shop);
	}

	@Override
	public void modifyShop(Shop shop) {
		// TODO Auto-generated method stub
		System.out.println("-------ShopDaoImp.modifyShop-----------"
				+ shop.getName());
		getSession().update(shop);
	}
	

	@Override
	public List<Shop> findAllShop() {
		// TODO Auto-generated method stub
		System.out.println("-------ShopDaoImp.findAll-----------");
		String hql = "from Shop";
		Query mQuery = getSession().createQuery(hql);
		return mQuery.list();
	}

	@Override
	public void deleteShopById(int id) {
		// TODO Auto-generated method stub
		getSession().delete(getSession().load(Shop.class, id));
	}

}
