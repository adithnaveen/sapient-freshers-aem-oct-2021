package com.naveen.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaEx01 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,23,65,45,78,98,32,44);
		
		System.out.println("Using For loop ");
		for(int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		// enchnace for loop 
		
		System.out.println("using enhanced for loop ");
		for(Integer temp : numbers) {
			System.out.println(temp);
		}
		
		// version 1 
		System.out.println("using consumer... with variable  ");
		Consumer<Integer> consumer = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
			
		};
		
		
		numbers.forEach(consumer);
		
		// version 2 
		System.out.println("using consumer without holding variable... ");
		numbers.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
			
		}); 
		
		// version 3 - lambda 
		System.out.println("using lambda way  with data type pass ");
		numbers.forEach(  (Integer t) -> System.out.println(t) ); 
		
		// version 4 - lambda 
		System.out.println("using lambda way  without data type pass ");
		numbers.forEach((t) -> System.out.println(t) ); 
		
		// version 5 - method reference  
		System.out.println("using method way  without data type pass ");
		numbers.forEach(System.out :: println ); 
		
	}
}
