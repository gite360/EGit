package com.jialin.dao;

import java.util.List;

import com.jialin.entity.Shop;

public interface IShopDao {
	public void AddShop(Shop shop);
	public void modifyShop(Shop shop);
	public void deleteShop(Shop shop);
	public void deleteShopById(int id);
	
	public List<Shop> findAllShop();
}
