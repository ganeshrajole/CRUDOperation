package com.sak.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sak.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Serializable> {

}
