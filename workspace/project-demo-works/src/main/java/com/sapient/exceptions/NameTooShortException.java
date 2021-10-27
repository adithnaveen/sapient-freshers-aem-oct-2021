package com.sapient.exceptions;

public class NameTooShortException extends Exception {
	private String msg; 
	
	public NameTooShortException() {
		this.msg = "Name too short"; 
	}
	
	public NameTooShortException(String msg) {
		this.msg = msg; 
	}

	@Override
	public String toString() {
		return "NameTooShortException [msg=" + msg + "]";
	}
	
	
}
