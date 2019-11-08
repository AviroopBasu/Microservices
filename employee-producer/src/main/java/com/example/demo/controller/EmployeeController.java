package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;


@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@RequestMapping(value = "/get-employees", method = RequestMethod.GET)
	public Iterable<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
	
	@RequestMapping(value = "/add-employees", method = RequestMethod.POST)
	public String addEmployee(@RequestBody List<Employee> employeeList) {
		employeeRepository.saveAll(employeeList);
		return "Successfully inserted";
		
	}
	

}