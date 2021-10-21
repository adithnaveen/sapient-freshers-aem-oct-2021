package com.naveen.collections;

import java.util.Vector;

public class ListEx3 {
	public static void main(String[] args) {
		// they are thread safe 
		Vector<String> list = new Vector<String>(); 
		
		System.out.println("size " + list.size());
		System.out.println("Capacity " + list.capacity());
		
		list.add("One"); 
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");		
		
		list.add("One"); 
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		
		list.add("One"); 

		System.out.println("size " + list.size());
		System.out.println("Capacity " + list.capacity());
		
		Vector<String> list1 = new Vector<String>(3, 5); 

		System.out.println("list1-size " + list1.size());
		System.out.println("list1-Capacity " + list1.capacity());
		
		list1.add("ONE");
		list1.add("ONE"); 
		list1.add("ONE"); 
		list1.add("ONE"); 
		

		System.out.println("list1-size " + list1.size());
		System.out.println("list1-Capacity " + list1.capacity());
		 
	}
}
