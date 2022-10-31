package com.tnsif.service;

import java.util.List;

import com.tnsif.entities.ShopOwner;

public interface IShopOwnerService {

	void addShopOwner(ShopOwner shopOwner);
	
	void updateShopOwner(Integer id,ShopOwner shopOwner);
	
	ShopOwner searchShopOwner(Integer id);
	
	void deleteShopOwner(Integer id);

	List<ShopOwner> listAllShopOwners();
}
