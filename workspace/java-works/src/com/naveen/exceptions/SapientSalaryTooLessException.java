package com.naveen.exceptions;

public class SapientSalaryTooLessException extends Exception {
	private String msg; 
	
	public SapientSalaryTooLessException() {
		this.msg = "Sorry improper salary"; 
	}
	
	public SapientSalaryTooLessException(String msg) {
		this.msg = msg; 
	}

	@Override
	public String toString() {
		return "SapientSalaryTooLessException [msg=" + msg + "]";
	}
	
	
}
