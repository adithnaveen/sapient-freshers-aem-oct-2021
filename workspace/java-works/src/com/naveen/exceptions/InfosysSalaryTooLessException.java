package com.naveen.exceptions;

public class InfosysSalaryTooLessException extends Exception {
	private String msg; 
	
	public InfosysSalaryTooLessException() {
		msg = "Sorry improper infy salary"; 
	}
	
	public InfosysSalaryTooLessException(String msg) {
		this.msg = msg; 
	}

	@Override
	public String toString() {
		return "InfosysSalaryTooLessException [msg=" + msg + "]";
	}
	
	
}
