package com.dicka.serviceemployeedashboard.serviceproxy;

import java.util.Collection;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.dicka.serviceemployeedashboard.model.EmployeeInfo;

@FeignClient(name = "service-search-employee")
@RibbonClient(name = "service-search-employee")
public interface EmployeeServiceProxyFeign {

	@GetMapping(value = "/employee/findall")
	Collection<EmployeeInfo> findAll();
	
}
