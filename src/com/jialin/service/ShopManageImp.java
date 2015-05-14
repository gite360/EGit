package com.jialin.service;

import java.util.List;

import javax.annotation.Resource;

import com.jialin.dao.IShopDao;
import com.jialin.dao.IUserDao;
import com.jialin.entity.Shop;
import com.jialin.entity.User;

public class ShopManageImp implements IShopManage {
	
	@Resource  
	private IShopDao shopDao;
	


	public void setShopDao(IShopDao shopDao) {
		this.shopDao = shopDao;
	}

	public IShopDao getShopDao() {
		return shopDao;
	}

	@Override
	public void addShop(Shop shop) {
		// TODO Auto-generated method stub
		System.out.println("------ShopManageImp.addShop--------"+shop.getName());
		shopDao.AddShop(shop);
	}

	@Override
	public void deleteShop(Shop shop) {
		// TODO Auto-generated method stub
		System.out.println("------ShopManageImp.deleteShop--------"+shop.getName());
		shopDao.deleteShop(shop);
		
	}

	@Override
	public void modifyShop(Shop shop) {
		// TODO Auto-generated method stub
		System.out.println("------ShopManageImp.modifyShop--------"+shop.getName());
		shopDao.modifyShop(shop);
	}

	@Override
	public List<Shop> findAllshop() {
		// TODO Auto-generated method stub
		return shopDao.findAllShop();
	}

	@Override
	public void deleteShopById(int id) {
		// TODO Auto-generated method stub
		shopDao.deleteShopById(id);
	}
}
