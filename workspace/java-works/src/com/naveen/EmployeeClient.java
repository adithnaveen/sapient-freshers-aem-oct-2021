package com.naveen;

import com.naveen.beans.Employee;


public class EmployeeClient {
	public static void main(String[] args) {
	
		
		Employee emp = new Employee();  // this is the reference  + instantiate an object 
		
	
		 
		emp.setEmpName("Manav");
		emp.setEmpSalary(-1234);
		
		System.out.println(emp.hashCode());
		display(emp);
		
		emp.setEmpName("Manav");
		System.out.println("Employee Name " + emp.getEmpName());
		
		
		System.out.println("-------------------------------------------");
		Employee emp1 = new Employee(102, "Hemanth",-3322); 
		System.out.println(emp1.hashCode());
		display(emp1);
		
	
		Employee emp2 = new Employee("sajid", 2233); 
		display(emp2);
		
		Employee emp3 = new Employee("Arjun", 3322); 
		display(emp3);
		
		Employee emp4 = new Employee("Ashotosh", 1322); 
		display(emp4);
	}

	private static void display(Employee emp1) {
		System.out.println("--------------------------------");
		System.out.println("Employee Id " + emp1.getEmpId());
		System.out.println("Employee Name " + emp1.getEmpName());
		System.out.println("Employee Salary " + emp1.getSalary());
	}
}
