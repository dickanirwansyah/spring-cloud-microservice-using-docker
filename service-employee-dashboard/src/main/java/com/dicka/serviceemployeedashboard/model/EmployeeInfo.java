package com.dicka.serviceemployeedashboard.model;

public class EmployeeInfo {

	private Long employeeId;
	private String name;
	private String practiceArea;
	private String designation;
	private String companyInfo;
	
	public EmployeeInfo(){
		
	}
	
	public String getCompanyInfo(){
		return companyInfo;
	}
	
	public void setCompanyInfo(String companyInfo){
		this.companyInfo = companyInfo;
	}
	
	public String getDesignation(){
		return designation;
	}
	
	public void setDesignation(String designation){
		this.designation = designation;
	}
	
	public String getPracticeArea(){
		return practiceArea;
	}
	
	public void setPracticeArea(String practiceArea){
		this.practiceArea = practiceArea;
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
}
