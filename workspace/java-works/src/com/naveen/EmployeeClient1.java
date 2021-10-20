package com.naveen;

import com.naveen.beans.Employee;

// to show working of tostring
public class EmployeeClient1 {
	public static void main(String[] args) {
		Employee employee = new Employee("Lokesh", 1234); 
		
		System.out.println(employee);
	}
}
