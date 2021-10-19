package com.naveen;

import com.naveen.beans.Employee;

public class EmployeeClient {
	public static void main(String[] args) {
		Employee emp = new Employee();  // this is the reference  + instantiate an object 
		
		emp.setEmpId(101);
		emp.setEmpName("Man");
		emp.setEmpSalary(-1234);
		
		System.out.println(emp.hashCode());
		System.out.println("Employee Id " + emp.getEmpId());
		System.out.println("Employee Name " + emp.getEmpName());
		System.out.println("Employee Salary " + emp.getSalary());
		
		System.out.println("-------------------------------------------");
		Employee emp1 = new Employee(102, "Hemanth",-3322); 
		System.out.println(emp1.hashCode());
		System.out.println("Employee Id " + emp1.getEmpId());
		System.out.println("Employee Name " + emp1.getEmpName());
		System.out.println("Employee Salary " + emp1.getSalary());
		
	}
}
