package com.naveen.lambda;


@FunctionalInterface
interface MyFunction {
	void hi();
	default void  bye() {
		System.out.println("hey i'm from bye.. ");
	}
	static void cya() {
		System.out.println("Hey i'm from static...");
	}
}

public class DefaultStaticDemo {
	public static void main(String[] args) {
		MyFunction mf = () -> System.out.println("hi");
		mf.bye(); 
		MyFunction.cya(); 
	}
}
