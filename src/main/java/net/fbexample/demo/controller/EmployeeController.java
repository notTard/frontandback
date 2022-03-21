package net.fbexample.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.fbexample.demo.service.EmployeeService;

public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeServ;
	
	//Вывести на экран всех работников (display all employees)
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listEmployees",employeeServ.getAllEmployees());
		return "index";
	}
}
