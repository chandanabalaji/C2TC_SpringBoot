package com.tnsif.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.entities.Item;

public interface IItemRepository extends JpaRepository<Item, Integer>{

}
