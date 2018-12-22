package com.dicka.serviceemployeedashboard.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dicka.serviceemployeedashboard.model.EmployeeInfo;
import com.dicka.serviceemployeedashboard.serviceproxy.EmployeeServiceProxyFeign;

@RestController
public class EmployeeProxyController {

	private final EmployeeServiceProxyFeign employeeProxy;
	
	@Autowired
	public EmployeeProxyController(EmployeeServiceProxyFeign employeeProxy){
		this.employeeProxy = employeeProxy;
	}
	
	@GetMapping(value = "/dashboard/feign/peers")
	public Collection<EmployeeInfo> findEmployeeProxy(){
		return employeeProxy.findAll();
	}
}
