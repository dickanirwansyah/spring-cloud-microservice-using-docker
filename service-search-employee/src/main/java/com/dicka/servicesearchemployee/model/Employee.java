package com.dicka.servicesearchemployee.model;

public class Employee {

	private Long employeeId;
	private String name;
	private String practiceArea;
	private String designation;
	private String companyInfo;
	
	public Employee(){
		
	}
	
	public String getCompanyInfo(){
		return companyInfo;
	}
	
	public void setCompanyInfo(String companyInfo){
		this.companyInfo = companyInfo;
	}
	
	public void setDesignation(String designation){
		this.designation = designation;
	}
	
	public String getDesignation(){
		return designation;
	}
	
	public Long getEmployeeId(){
		return employeeId;
	}
	
	public void setEmployeeId(Long employeeId){
		this.employeeId = employeeId;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getPracticeArea(){
		return practiceArea;
	}
	
	public void setPracticeArea(String practiceArea){
		this.practiceArea = practiceArea;
	}
}
