package com.tnsif.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.entities.*;
import com.tnsif.repository.*;


@Service
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeRepository repo;	
	
	@Override
	public void addEmployee(Employee employee) {
		repo.save(employee);
	}
		
	@Override
	public void updateEmployee(Integer id,Employee employeeDetails) {	
		 Employee updateEmployee = this.searchEmployee(id);
		 updateEmployee.setName(employeeDetails.getName());
		 updateEmployee.setDesignation(employeeDetails.getDesignation());
		 updateEmployee.setAddress(employeeDetails.getAddress());
		 updateEmployee.setSalary(employeeDetails.getSalary());
		 updateEmployee.setDob(employeeDetails.getDob());
		// updateEmployee.setShop(employeeDetails.getShop());
		 this.addEmployee(updateEmployee);
	}
	
	@Override
	public Employee searchEmployee(Integer id) {
		return repo.findById(id).get();
	}
	
	@Override
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public List<Employee> listAllEmployees() {
		return repo.findAll();
	}
	

}
