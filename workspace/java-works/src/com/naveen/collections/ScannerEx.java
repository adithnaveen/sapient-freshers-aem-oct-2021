package com.naveen.collections;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Your Name"); 
		String name = sc.next(); 
		System.out.println("Enter your Age");
		int age = sc.nextInt(); 
		
		
		System.out.println("Your Name " + name +" age " + age);
	}
}
