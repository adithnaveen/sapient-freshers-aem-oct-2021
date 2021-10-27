package com.naveen.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectorsEx2 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		System.out.println("-------------------------------");
		List<Integer> list = new ArrayList<Integer>(); 
		IntStream.range(0, 10).forEach(i -> list.add(i));
		list.forEach(System.out :: println);
		
		System.out.println("-------------------------------");
		// start with some series and increment with some double value 
		Stream.iterate(23.4, i -> i+ 2.3).limit(10)
			.forEach(System.out :: println);
	}
}
