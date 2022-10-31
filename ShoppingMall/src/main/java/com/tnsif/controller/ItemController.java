package com.tnsif.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.entities.Item;
import com.tnsif.service.IItemService;


@RestController
@RequestMapping("item")
public class ItemController {

	@Autowired
	private IItemService service;
	
	@GetMapping("/list")
	public List<Item> getAllShopOwners(){
		return service.listAllItems();
	}
	
	@PostMapping("/create")
	public void createItem(@RequestBody Item item) {
		service.addItem(item);
	}
	
	@GetMapping("/search/{id}")
	public ResponseEntity<Item> getShopOwnerById(@PathVariable Integer id){
		Item item = service.searchItem(id);
		return new ResponseEntity<Item>(item, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteShopOwnerById(@PathVariable Integer id) {
		service.deleteItem(id);
	}
	
	@PutMapping("/update/{id}")
	public void updateShopOwner(@PathVariable Integer id,@RequestBody Item item) {
		service.updateItem(id, item);
	}
}
