package net.fbexample.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.fbexample.demo.dao.EmployeeDAO;
import net.fbexample.demo.model.EmployeeModel;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	public List<EmployeeModel> getAllEmployees(){
		return  employeeDAO.findAll();
	}
}
