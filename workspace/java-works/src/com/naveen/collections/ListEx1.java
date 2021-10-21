package com.naveen.collections;

import java.util.ArrayList;

public class ListEx1 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList(); 
		
		list.add(10); 
		list.add("hello"); 
		list.add(true);
		list.add(new Object()); 
		
		for(Object o : list) {
			System.out.println(o);
		}
		
		System.out.println(list.size());
	}
}
