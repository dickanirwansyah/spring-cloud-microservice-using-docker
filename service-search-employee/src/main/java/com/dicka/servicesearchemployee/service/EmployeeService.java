package com.dicka.servicesearchemployee.service;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.dicka.servicesearchemployee.model.Employee;

@Service
public class EmployeeService {

	private static Map<Long, Employee> EmployeeRepository = null;
	
	static {
		Stream<String> employeeStream = Stream
				.of("1,Shamikh Mitra,Java,Architech",
						"2,Denada Mitra,C++,Manager",
						"3,Dicka Mitra,Python,Datascients");
		
		EmployeeRepository = employeeStream
				.map(employers -> {
					String[] info = employers.split(",");
					return createEmployee(new Long(info[0]), info[1], info[2], info[3]);
				}).collect(Collectors
						.toMap(Employee::getEmployeeId, 
								emp -> emp));
	}
	
	private static Employee createEmployee(Long id, String name, String practiceArea, String designation){
		Employee employee = new Employee();
		employee.setEmployeeId(id);
		employee.setName(name);
		employee.setPracticeArea(practiceArea);
		employee.setDesignation(designation);
		employee.setCompanyInfo("Emerio - OGYA");
		return employee;
	}
	
	public Employee findById(Long id){
		return EmployeeRepository.get(id);
	}
	
	public Collection<Employee> findAll(){
		return EmployeeRepository.values();
	}
}
