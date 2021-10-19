package com.naveen.beans;

public class Employee {
	private int empId; 
	private String empName; 
	private double empSalary; 
	
	
//	Employee() - implicitly given by compiler if you dont have 
	public Employee() {
		System.out.println("Employee Contructor Called...");
	}
	
	public Employee(int empId, String empName, double empSalary) {
		this.empId = empId;
		this.empName  = empName; 
		this.empSalary = empSalary; 
	}
	
	// you have to expose getters and setters 
	
	//access-specifier (access-mofier) return-type method-name(args)
	
	public int getEmpId() {
		return empId; 
	}
	
	public String getEmpName() {
		return empName; 
	}
	public double getSalary() {
		return empSalary; 
	}
	
	public void setEmpId(int empId) {
		this.empId = empId; 
	}
	public void setEmpName(String empName) {
		if(empName.length() < 5 ) {
			System.out.println("Sorry Invalid Name ");
			this.empName = "No Name"; 
		}else 
			this.empName = empName; 
	}
	public void setEmpSalary(double empSalary) {
		if(empSalary < 0) {
			System.out.println("Sorry Invalid Salary ");
			this.empSalary = 1000; 
		}else 
			this.empSalary = empSalary; 
	}
}
