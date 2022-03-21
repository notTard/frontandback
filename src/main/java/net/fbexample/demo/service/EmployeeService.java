package net.fbexample.demo.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.fbexample.demo.model.EmployeeModel;

@Repository
public interface EmployeeService{
	List<EmployeeModel> getAllEmployees();
}
