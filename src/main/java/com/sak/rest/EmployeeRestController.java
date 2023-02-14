package com.sak.rest;

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
import org.springframework.web.bind.annotation.RestController;

import com.sak.entity.Employee;
import com.sak.service.EmployeeService;

@RestController
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/addemp")
	public ResponseEntity<String> addEmployee(@RequestBody Employee emp){
		
		String status = empService.addEmployee(emp);
		
		return new ResponseEntity<>(status,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getemp/{empId}")
	public ResponseEntity<Employee> getEmployee (@PathVariable Integer empId){
		
		Employee byId = empService.getById(empId);
		
		return new ResponseEntity<> (byId,HttpStatus.OK);
		
	}

	@GetMapping("/getAllEmps")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		
		List<Employee> allEmployee = empService.getAllEmployee();
		
		return new ResponseEntity<> (allEmployee,HttpStatus.OK);
		
	}
	
	@PutMapping("/updateemp")
	 public ResponseEntity<String> updateEmployee(@RequestBody Employee emp){
		
		String updateEmployee = empService.updateEmployee(emp);
		
		return new ResponseEntity<> (updateEmployee,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteemp/{empId}")
	public ResponseEntity<String> deleteEmployeeById(@PathVariable Integer empId){
		
           String deleteById = empService.deleteEmployeeById(empId);
           
           return new ResponseEntity<> (deleteById,HttpStatus.OK);
	}
}
