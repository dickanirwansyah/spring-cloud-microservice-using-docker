package com.dicka.servicesearchemployee.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dicka.servicesearchemployee.model.Employee;
import com.dicka.servicesearchemployee.service.EmployeeService;

@RestController
@RefreshScope
public class EmployeeController {

	private final EmployeeService employeeService;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService){
		this.employeeService = employeeService;
	}
	
	@GetMapping(value = "/employee/find/{id}")
	public Employee findById(Long id){
		return employeeService.findById(id);
	}
	
	@GetMapping(value = "/employee/findall")
	public Collection<Employee> findAll(){
		return employeeService.findAll();
	}
}
