package com.naveen;

/**
 * 
 * @author naveenkumar
 * @apiNote this is for testing 
 * @since Oct 2021 
 * @see this is in some see section in documentation 
 */
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		String name = "Manav"; 
		HelloWorld h = new HelloWorld();
		String retVal = h.doSomeWork(name);
		System.out.println("Ret Value " + retVal);
	}
	
	// this scope is available only when you say new
	/**
	 * 
	 * @param name
	 * @return hello user name 
	 * @since Oct 2021 
	 */
	public String doSomeWork(String name) {
		return "Hello " + name;
	}
	
}
