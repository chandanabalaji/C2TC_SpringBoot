package com.tnsif.service;

import com.tnsif.entities.*;

public interface IMallService {
	
	void addMall(Mall mall);
	
	void updateMall(Integer id,Mall mall);
	
	Mall searchMall(Integer id);
}
