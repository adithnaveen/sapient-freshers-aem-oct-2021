package com.naveen.lambda;

import java.util.stream.IntStream;

// threads in java 
public class LambdaEx4 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<50; i++) {
					System.out.println("I Value is " + " in " + Thread.currentThread().getName());
				}
			}
		}).start();  
		
		// in lambda way 
		new Thread( () -> {
			for(int i=0; i<50; i++) {
				System.out.println("I Value is " + " in " + Thread.currentThread().getName());
			}
		} ).start(); 
		
		// in labmbda way + stream 
		new Thread( () -> {
			IntStream.range(0, 50).forEach((val) -> System.out.println(val)); 
		}).start(); 
	}
}












