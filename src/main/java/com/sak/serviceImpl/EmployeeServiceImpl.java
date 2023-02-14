package com.sak.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sak.entity.Employee;
import com.sak.repository.EmployeeRepository;
import com.sak.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public String addEmployee(Employee emp) {

		empRepo.save(emp);

		return "Success";
	}

	@Override
	public String updateEmployee(Employee emp) {

		empRepo.save(emp);

		return "Update Successfully";
	}

	@Override
	public Employee getById(Integer empId) {

		Optional<Employee> findById = empRepo.findById(empId);

		if (findById.isPresent()) {

			return findById.get();

		}
		    return null;
        }

	@Override
	public List<Employee> getAllEmployee() {

		return empRepo.findAll();
	}

	@Override
	public String deleteEmployeeById(Integer empId) {

		if (empRepo.existsById(empId)) {
			
			empRepo.deleteById(empId);

			return "Record Delete Successfully";
		} else {
			return "No Record Found";
		}

	}

}