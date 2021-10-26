package com.naveen.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaEx3 {
	public static void main(String[] args) {
		List<Person> list = Arrays.asList(
				new Person(123, "Ashutosh"), 
				new Person(45, "Akash"), 
				new Person(23, "Ronak"), 
				new Person(36, "Arti"), 
				new Person(63, "Bhavya"), 
				new Person(11, "Phankuri") 
				);
		
		list.forEach(System.out :: println);
		
		// version 1 
		Comparator<Person> ascPID = new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getpId() - o2.getpId();
			}
			
		};
		
		Collections.sort(list, ascPID);
		System.out.println("After sorting");
		list.forEach(System.out :: println);
		
		// labmda way 
		Collections.sort(list, (o1, o2) -> o2.getpId() - o1.getpId());
		System.out.println("After sorting- descending order ");
		list.forEach(System.out :: println);
		
		Collections.sort(list, (o1, o2) -> o1.getpName().compareTo(o2.getpName()));
		
		System.out.println("Ascending order  of name");
		list.forEach(System.out :: println);
		
		Comparator<Person> sortAscName = (o1, o2) -> o1.getpName().compareTo(o2.getpName());
		Collections.sort(list, sortAscName.reversed());

		System.out.println("Descending order  of name");
		list.forEach(System.out :: println);
	}
}











