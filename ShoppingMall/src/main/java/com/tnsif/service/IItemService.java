package com.tnsif.service;

import java.util.List;

import com.tnsif.entities.Item;

public interface IItemService {

	void addItem(Item item);
	
	void updateItem(Integer id,Item item);
	
	Item searchItem(Integer id);
	
	void deleteItem(Integer id);
	
	List<Item> listAllItems();
}
