package com.naveen.collections;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); 
		
		set.add("Lokesh");
		set.add("Utkarsh");

		System.out.println(set.add("Rishab"));  
		System.out.println(set.add("Rishab"));  
		System.out.println(set.add("Rishab"));  
		

		System.out.println(set.size());
		System.out.println(set);
		
	}
}
