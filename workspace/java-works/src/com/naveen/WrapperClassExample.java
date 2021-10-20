package com.naveen;

public class WrapperClassExample {
	public static void main(String[] args) {
		Integer i = 10; 
		Integer ii = new Integer("10"); 
		Integer iii = Integer.valueOf("10");
		
		double doubleIII = iii.doubleValue(); 
		
		String ss = new String("testing"); 
		System.out.println(ss.indexOf("i"));
		
	}
}
