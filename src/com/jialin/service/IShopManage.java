package com.jialin.service;

import java.util.List;

import com.jialin.entity.Shop;

public interface IShopManage {
	public void addShop(Shop shop);
	public void modifyShop(Shop shop);
	public void deleteShop(Shop shop);
	public void deleteShopById(int id);
	
	public List<Shop> findAllshop();
}
