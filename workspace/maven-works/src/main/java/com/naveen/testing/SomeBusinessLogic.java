package com.naveen.testing;

public class SomeBusinessLogic {

	public String insert(String name) {
		return "Inserted " + name; 
	}
	
	public String insertException(String name) {
		if(name.length()<6) {
			throw new RuntimeException("Sorry name too short");
		}
		return "Inserted " + name;
	}
}
