package com.tnsif.repository;

import com.tnsif.entities.Mall;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMallRepository extends JpaRepository<Mall, Integer> //Entity class
{

}

