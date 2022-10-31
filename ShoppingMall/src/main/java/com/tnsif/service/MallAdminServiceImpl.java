package com.tnsif.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.entities.*;
import com.tnsif.repository.*;


@Service
@Transactional
public class MallAdminServiceImpl implements IMallAdminService {
	
	@Autowired
	private IMallAdminRepository repo;	
	
	@Autowired
	private IMallRepository repo1;
	
	@Autowired
	private IShopRepository repo2;
	
	@Autowired
	private IUserRepository repoUser;
	
	
	@Override
	public MallAdmin searchMallAdmin(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void addMallAdmin(MallAdmin admin) {
		// TODO Auto-generated method stub
		repo.save(admin);
	}

	@Override
	public void deleteMallAdmin(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public void updateMallAdmin(Integer id, MallAdmin admin) {
		// TODO Auto-generated method stub
		MallAdmin updateMallAdmin = this.searchMallAdmin(id);
		 updateMallAdmin.setName(admin.getName());
		 updateMallAdmin.setPassword(admin.getPassword());
		 updateMallAdmin.setMall(admin.getMall());
		 updateMallAdmin.setPhone(admin.getPhone());

		 this.addMallAdmin(updateMallAdmin);
	}

	@Override
	public void addMall(Mall mall) {
		// TODO Auto-generated method stub
			repo1.save(mall);
		
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
		return repo1.findById(id).get();
		
	}

	@Override
	public void approveNewShop(Shop shop) {
		// TODO Auto-generated method stub
		repo2.save(shop);
		
	}

	@Override
	public void updateUser(Integer id,User user) {
		// TODO Auto-generated method stub
		
		
		 User updateUser = this.searchUser(id);
		 updateUser.setName(user.getName());
		 updateUser.setType(user.getType());
		 updateUser.setPassword(user.getPassword()); 
		 
		 this.addUser(updateUser);		
	}

	@Override
	public User searchUser(Integer id) {
		// TODO Auto-generated method stub
		return repoUser.findById(id).get();
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		repoUser.save(user);
	}
	

}
