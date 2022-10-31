package com.tnsif.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.entities.ShopOwner;
import com.tnsif.repository.IShopOwnerRepository;

@Service
@Transactional
public class ShopOwnerServiceImpl implements IShopOwnerService{

	@Autowired
	private IShopOwnerRepository repo;
	
	@Override
	public void addShopOwner(ShopOwner shopOwner) {
		// TODO Auto-generated method stub
		repo.save(shopOwner);
	}
	
	@Override
	public void updateShopOwner(Integer id, ShopOwner shopOwner) {
		// TODO Auto-generated method stub
		ShopOwner updateOwner = this.searchShopOwner(id);
		updateOwner.setName(shopOwner.getName());
		updateOwner.setDob(shopOwner.getDob());
		updateOwner.setAddress(shopOwner.getAddress());
		this.addShopOwner(updateOwner);
	}

	@Override
	public ShopOwner searchShopOwner(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void deleteShopOwner(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public List<ShopOwner> listAllShopOwners() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	
}
