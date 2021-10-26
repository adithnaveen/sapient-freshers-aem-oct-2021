package com.naveen.lambda;

@FunctionalInterface
interface Executable{
	 int execute(int a, int b);
}

@FunctionalInterface
interface StringExecutable {
	String stringExecute(String a, String b);
}

public class LambdaEx2 {
	public static void main(String[] args) {
		Executable add = (a, b) -> a+b; 
		Executable sub = (a, b ) -> a - b; 
		Executable mul = (a, b) -> a * b; 
		
		int result = add.execute(10, 20);
		int subResult = sub.execute(100, 20); 
		int mulResult = mul.execute(20, 10); 
		
		System.out.println(result);
		System.out.println(subResult);
		System.out.println(mulResult);
		// Lokesh, Jaiswal -> Hello Lokesh Jaiswal
		
		StringExecutable strEx = (a, b) -> "Hello : "+ a.concat(b); 
		String fullName = strEx.stringExecute("Lokesh", "Jaiswal"); 
		System.out.println(fullName);
		
		
		
		
	}
}
