package com.tnsif.service;

import java.util.List;

import com.tnsif.entities.Shop;

public interface IShopService {

	void addShop(Shop shop);
	
	void updateShop(Integer id,Shop shop);
	
	Shop searchShop(Integer id);
	
	void deleteShop(Integer id);

	List<Shop> listAllShops();
}
