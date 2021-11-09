package com.sapient.exception;

public class NameTooShortException extends Exception{
	private String msg; 
	public NameTooShortException() {
		this.msg = "name too short";
	}
	
	public  NameTooShortException (String msg) {
		this.msg = msg;
	}
}
