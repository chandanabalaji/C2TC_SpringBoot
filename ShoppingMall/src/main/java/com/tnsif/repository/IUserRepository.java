package com.tnsif.repository;


import com.tnsif.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository  extends JpaRepository<User, Integer> {

}
