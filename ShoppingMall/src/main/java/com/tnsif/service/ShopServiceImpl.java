package com.tnsif.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.entities.Shop;
import com.tnsif.repository.IShopRepository;

@Service
@Transactional
public class ShopServiceImpl implements IShopService{

	@Autowired
	private IShopRepository repo;
	
	@Override
	public void addShop(Shop shop) {
		// TODO Auto-generated method stub
		repo.save(shop);
	}

	@Override
	public void updateShop(Integer id, Shop shop) {
		// TODO Auto-generated method stub
		Shop updateShop = this.searchShop(id);
		 updateShop.setItems(shop.getItems());
		 updateShop.setLeaseStatus(shop.getLeaseStatus());
		 updateShop.setShopCategory(shop.getShopCategory());
		 updateShop.setShopEmployees(shop.getShopEmployees());
		 updateShop.setShopName(shop.getShopName());
		 updateShop.setShopOwner(shop.getShopOwner());
		 updateShop.setShopStatus(shop.getShopStatus());
		 this.addShop(updateShop);
	}

	@Override
	public Shop searchShop(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void deleteShop(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public List<Shop> listAllShops() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
}
