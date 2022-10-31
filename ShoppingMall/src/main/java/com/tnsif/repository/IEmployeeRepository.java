package com.tnsif.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.entities.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer>{
	
}
