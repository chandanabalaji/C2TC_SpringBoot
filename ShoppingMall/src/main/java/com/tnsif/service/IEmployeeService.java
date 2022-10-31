package com.tnsif.service;


import java.util.List;

import com.tnsif.entities.Employee;

public interface IEmployeeService {

	void addEmployee(Employee employee);
	
	void updateEmployee(Integer id,Employee employeeDetails);
	
	Employee searchEmployee(Integer id);
	
	void deleteEmployee(Integer id);

	List<Employee> listAllEmployees();
	
}
