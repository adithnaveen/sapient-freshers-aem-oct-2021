package com.naveen.collections;

import java.util.HashSet;
import java.util.Set;

public class SetEx2 {
	public static void main(String[] args) {
		Set<Employee> set = new HashSet<Employee>(); 

		set.add(new Employee(101, "Rishab", 22)); 
		set.add(new Employee(102, "Bhavya", 21)); 
		set.add(new Employee(103, "Akash", 21));
		set.add(new Employee(103, "Akash", 21));
		
		for(Employee temp : set) {
			System.out.println(temp +", " + temp.hashCode());
		}
		
	}
}
