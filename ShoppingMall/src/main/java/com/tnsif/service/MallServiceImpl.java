package com.tnsif.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.entities.*;
import com.tnsif.repository.*;

@Service
@Transactional

public class MallServiceImpl implements IMallService {
	
	@Autowired
	private IMallRepository repo;	
	
	

	@Override
	public void addMall(Mall mall) {
		// TODO Auto-generated method stub
			repo.save(mall);
		
	}

	@Override
	public void updateMall(Integer id,Mall mall) {
		// TODO Auto-generated method stub
			
		 Mall updateMall = this.searchMall(id);
		 updateMall.setMallName(mall.getMallName());
		 updateMall.setMallAdmin(mall.getMallAdmin());
		 updateMall.setLocation(mall.getLocation());
		 updateMall.setCategories(mall.getCategories());
		 updateMall.setShopId(mall.getShopId());
		 

		 this.addMall(updateMall);
		
	}

	@Override
	public Mall searchMall(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
		
	}

}
