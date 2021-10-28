package com.naveen.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

/** 
 * 
 * @author naveenkumar
 * @see to show working of sorting with collection style vs stream style 
 */

@Slf4j
public class SortByCollection01 {
	public static void main(String[] args) {
//		withOldStyle();
		List<String> list = List.of("Sajid", "Pankhuri", "Arti", "Amit"); 	
		
		System.out.println("Using Stream.. ");
		list.stream().sorted().forEach(System.out :: println);
		
		
		// use only for large amount of data 
		System.out.println("Using Parallel Stream.. ");
		list.parallelStream().sorted().forEachOrdered(val -> log.info(val));
		

		
	}

	private static void withOldStyle() {
		List<String> names = new ArrayList(); 
		names.add("Sajid"); 
		names.add("Pankhuri"); 
		names.add("Arti"); 
		names.add("Amit"); 
		
		Comparator<String> ascNames = (o1, o2) -> o1.compareTo(o2); 
		
		Collections.sort(names, ascNames);
		
		for(String temp : names) {
			System.out.println(temp);
		}
	}
}
