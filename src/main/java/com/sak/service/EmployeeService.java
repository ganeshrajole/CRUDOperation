package com.sak.service;

import java.util.List;

import com.sak.entity.Employee;

public interface EmployeeService {
	
	
	public String addEmployee(Employee emp);
	
	public Employee getById(Integer empId);
	
	public List<Employee> getAllEmployee();
	
	public String deleteEmployeeById(Integer empId);
	
	public String updateEmployee(Employee emp);

}
