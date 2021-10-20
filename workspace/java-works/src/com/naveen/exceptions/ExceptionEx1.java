package com.naveen.exceptions;

public class ExceptionEx1 {
	public static void main(String[] args) {
		System.out.println("Start of program");
		try {
			int num1 = Integer.parseInt(args[0]);  // 10a
			int num2 = Integer.parseInt(args[1]); 
			int res = num1 / num2; 
			System.out.println("Result " + res);
			
			try {
				int arr [] = new int[-3];
			}catch(NegativeArraySizeException nase) {
				nase.printStackTrace(); 
				try {
						System.out.println("Some code goes here ");
						int xyz = 10/0; 
				}catch(Exception e) {}
			}
		}catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Something went wrong please contact Admin :" + e);
		}finally {
			System.out.println("hey i'm in finally... ");
		}
		
		System.out.println("End of program");
	}
}
