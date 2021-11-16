package com.naveen.cleancoding;

import java.io.BufferedReader;

class Employee {
	private int empId;
	private String empName;
}

class GetMeEmployee {
	public static Employee getEmployee() {
		return null;
	}
}

public class Sample1 {

	public static void main(String[] args) {
		int x = 10;

		System.out.println(x);

		// version 1
		Employee employee =null; 
		try {
			 employee = GetMeEmployee.getEmployee();
		} catch (NullPointerException e) {
			e.printStackTrace(); 
		}
		System.out.println(employee);

		
		// version 2 is better 
		Employee employee1 =  GetMeEmployee.getEmployee();
		
		if(employee1 == null) {
			// do something 
		}else {
			// do something more 
		}
	}
}
