package com.sapient.exceptions;

public class InvalidEmailException extends Exception {
	private String msg; 
	
	public InvalidEmailException() {
		this.msg = "invlid email"; 
	}

	public InvalidEmailException(String msg) {
		this.msg = msg;
	}

}
