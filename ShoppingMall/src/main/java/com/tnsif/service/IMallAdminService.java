package com.tnsif.service;


import com.tnsif.entities.*;


public interface IMallAdminService {
	
	MallAdmin searchMallAdmin(Integer id);
	
	void addMallAdmin(MallAdmin admin);
	
	void updateMallAdmin(Integer id,MallAdmin admin);
	
	void deleteMallAdmin(Integer id);
	
	void addMall(Mall mall);
	
	void updateMall(Integer id,Mall mall);
	
	Mall searchMall(Integer id);
	
	void approveNewShop(Shop shop);
	
	void updateUser(Integer id,User user);
	
	User searchUser(Integer id);
	
	void addUser(User user);
	
}
