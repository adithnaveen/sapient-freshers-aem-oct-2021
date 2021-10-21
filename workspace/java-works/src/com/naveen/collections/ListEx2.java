package com.naveen.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		
		list.add("Hello");
		list.add("Hi"); 
		list.add("Cya");
		
		list.add(2, "Bhavya");
		
		for(String temp: list) {
			System.out.println( temp);
		}
		
		System.out.println("Size : "  + list.size() ); 
		System.out.println(	list.get(2)); 
//		list.clear(); 
		System.out.println("After clear Size : "  + list.size() ); 

//		---------------------------
		System.out.println("--------------------------");
		Iterator<String> iterator = list.iterator(); // are readonly, forward only 
		while(iterator.hasNext()) {
			String temp  = iterator.next(); 
			System.out.println(temp);
		}
		
	}
}
