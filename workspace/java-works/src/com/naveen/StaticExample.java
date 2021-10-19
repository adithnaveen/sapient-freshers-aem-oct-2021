package com.naveen;

public class StaticExample {
	static int si = 100; 
	
	// this block will be invoked without any 
	// invokation 
	static {
		System.out.println("1-Hi i'm from static block... ");
		si = 200; 
	}
	
	static {
		System.out.println("2-Hi i'm from static block... ");
	}
	
	
	
	static int add(int a, int b) {
		return a + b; 
	}
	static int sub(int a, int b) {
		return a - b; 
	}
	public static void main(String[] args) {
		System.out.println("Hi i'm in main.. ");
		
		System.out.println(add(10, 20));  
		System.out.println("si value " + si);
	}
}
