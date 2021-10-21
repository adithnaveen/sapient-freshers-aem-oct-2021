package com.naveen.collections;

import java.util.Set;
import java.util.TreeSet;

// working with treeset 
public class SetEx3 {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(); 
		
		set.add("Amit");
		set.add("Lokesh"); 
		set.add("Arti"); 
		set.add("Hemanth"); 
		
		System.out.println(set);
		
//		-- working with employee object 
		
		Set<Employee> set1  = new TreeSet<Employee>(); 
		
		set1.add(new Employee(103, "Akash", 21));
		set1.add(new Employee(103, "Akash", 21));
		set1.add(new Employee(101, "Rishab", 22)); 
		set1.add(new Employee(102, "Bhavya", 21)); 
		
		for(Employee temp : set1) {
			System.out.println(temp +", " + temp.hashCode());
		}
		
		 
	}
}
